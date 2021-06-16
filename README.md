# BookShelf
## Table of contents
- [About the project](#about-the-project)
- [Technology stack](#techonology-stack)
- [Docker](#docker)
## About the project
BookShelf it is online bookstore.  
Working branch -> dev

__Developers:__
1. Zheludkov D.M.
2. Sokolovskiy I.M.
3. Ladygin S.A.
---
---  
## Techonology Stack
- Java 15
- Postgres SQL
- Vue.js
- Maven
- Spring Boot
- Lombok
---
### Java Dependences  
* spring-boot-starter-data-jpa `v. 2.4.4`
* spring-boot-starter-jdbc `v. 2.4.4`
* spring-boot-starter-web `v. 2.4.4`
* spring-boot-devtools `v. 2.4.4`
* postgresql `v. 42.2.19`
* spring-boot-starter-test `v. 2.4.4`
* maven-javadoc-plugin `v. 3.2.0`
* lombok `v. 1.18.20`
### Plugins:
* spring-boot-maven-plugin
*  maven-javadoc-plugin `v. 3.2.0`
### Vue dependences
- axios: "^0.21.1",
- core-js: "^3.6.5",
- vue: "^3.0.0",
- vue-router: "^4.0.0-0"
---
For run: maven clean install
## Docker  

Fill .env file with necessary variables.

To start app use command:  
`sh start.sh`
