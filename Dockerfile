## Compile Stage ##
FROM gradle:6.9.3-jdk17 as compile
COPY . /home/source/java
WORKDIR /home/source/java
RUN gradle clean build

## Build Stage ##
FROM openjdk:17-jdk-alpine
WORKDIR /home/application/java
RUN apk update && \
    apk add --no-cache tzdata && \
    apk add --no-cache ttf-dejavu && \
    apk add --no-cache msttcorefonts-installer && \
    update-ms-fonts && fc-cache -f
ENV TZ=Asia/Bangkok
COPY --from=compile "/home/source/java/build/libs/demo*.jar" app.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-Xmx6144m", "-jar", "app.jar"]
