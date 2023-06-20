# Getting Started

- clone repository on instance
- edit env in application property
- docker build --pull --no-cache -t demo-image:dev .
- docker run -d -p 8080:8080 --name container-dev --restart=always demo-image:dev 

***
ลง db
- docker run -p 3306:3306 --name some-mariadb --env MARIADB_USER=example-user --env MARIADB_PASSWORD=my_cool_secret --env MARIADB_ROOT_PASSWORD=my-secret-pw  mariadb:latest
*** 
ืwebhook -> nginx , domain
