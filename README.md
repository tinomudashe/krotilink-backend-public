# krótiLink Backend API

Backend API for krótiLink, a URL shortener service. This API is built with Spring Boot and utilizes MySQL for data persistence.

[![Docker Hub](https://img.shields.io/badge/Docker-hub.docker.com%2Frepository%2Fdocker%2Ftin...-blue?style=for-the-badge)](https://hub.docker.com/repository/docker/tin...)

## 🛠️ Built With

* **[Java 21](https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html)**: The primary programming language.
* **[Spring Boot](https://spring.io/projects/spring-boot)**: A powerful framework for building stand-alone, production-grade Spring-based Applications.
* **[Spring Security](https://spring.io/projects/spring-security)**: A robust and highly customizable authentication and authorization framework for Java applications.
* **[Spring](https://spring.io/)**: The underlying application development framework for Java.
* **[MySQL](https://www.mysql.com/)**: A popular open-source relational database management system.
* **[Maven](https://maven.apache.org/)**: A powerful build automation tool used for project management and dependency management.
* **[Lambda](https://aws.amazon.com/lambda/)** (Likely for deployment or specific functionalities): A serverless, event-driven compute service.

## ⚙️ Features

* **User Authentication:**
    * Secure user signup and login functionality.
    * Implemented with JWT (JSON Web Tokens) for secure and stateless authentication.
    * Custom security configurations to meet specific application needs.
* **URL Shortening:**
    * Allows users to shorten long URLs into more manageable links.
* **Data Persistence:**
    * Utilizes Spring Data JPA for interacting with a MySQL database.
* **MySQL Database:** Leverages a MySQL database for data storage.
* **RESTful API:** Developed as a RESTful API using Spring Boot.
* **Robust Security:** Employs Spring Security for comprehensive authentication and authorization.
* **Stateless Authentication:** Uses JWT for secure and scalable authentication.
* **Project Management:** Built and managed using Maven for dependency and build management.
* **Cloud-Ready (Potentially):** Includes "Lambda" tag, suggesting potential deployment or integration with AWS Lambda.
* **Monitoring & Management:** Likely includes Spring Boot Actuator for application monitoring and management endpoints (though not explicitly listed in the provided info, it's common in Spring Boot projects).

## 📦 Dependencies (Managed by Maven)

* `org.springframework.boot:spring-boot-starter-web`
* `org.projectlombok:lombok`
* `org.springframework.boot:spring-boot-starter-test` (for testing)
* `org.springframework.boot:spring-boot-starter-data-jpa`
* `com.mysql:mysql-connector-j`
* `org.springframework.boot:spring-boot-starter-security`
* `org.springframework.security:spring-security-test` (for testing security)
* `io.jsonwebtoken:jjwt-api`
* `io.jsonwebtoken:jjwt-impl`
* `io.jsonwebtoken:jjwt-jackson`
* `org.springframework.boot:spring-boot-starter-actuator` (likely included for monitoring)

## 🏗️ Build Tool

This project is built and managed using **Maven**.

## 🌎 Languages

* **Java**: 100.0%
