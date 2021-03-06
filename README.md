# Project
SecuritySpringBoot is an example for spring security. The project has home page which is accessible to all. The employee and HR pages can be accessed only by authorised users.

Spring Security is a powerful and highly customizable authentication and access-control framework. Spring Security is a framework that focuses on providing both authentication and authorization to Java applications.

Authentication refers to the process of verifying the user, which is typically done by asking for credentials.
Authorization refers to the process of verifying whether or not the user is allowed to do a certain activity.

Role based authorization is included in the application. All users are allowed to login to Employees page but only admins can login in to HR page.

## Getting Started
This repository contains the code for the SecuritySpringBoot application. The code can be cloned to local directory.

Dependencies:
spring-boot-starter-web
spring-boot-starter-data-jpa
spring-boot-starter-security

MS SQL Server database with 4 tables- users, roles, user_role and Employees.
User table will have Id, name and password
Roles table will have Id, name
User_role is a join table of user_id and role_id.
 
## Features
SecuritySrpingBoot application has 3 pages. The home page is access to all. The other 2 pages needs user authentication. The username and password is stored in users table in MS SQL server database. The password is encrypted with BCrypt.
Users with roe USER can access Employee page and user with Role ADMIN can access HR page. Role based authorization helps to restrict access to certian pages to users of certain group.

## Deployment 
Generat jar and run the jar as java -jar security-0.1.0.jar.In Browser goto http://localhost:8080/ and the home page will be displayed. 
On clicking Employee link, login page will be displayed. Enter username and password to access employee page.

## Technology used
Spring Security is a framework that provides authentication, authorization, and protection against common attacks. With first class
support for both imperative and reactive applications, it is the de-facto standard for securing Spring-based applications.

The application is build on top of Spring Boot (http://projects.spring.io/spring-boot/) providing a runtime container.

Microsoft SQL Server 2019 is used for database.  Microsoft SQL Server Management Studio is used to connect to the database server using SQL Server Authentication. After login create database and create registered_user table to save the registered users details

Spring Data JPA is used for database integration. Hibernate is included by default. Spring Boot will automatically configure default Hibernate properties. Database URL, username and password is given in Appilcation.properties file.

BCryptPasswordEncoder is implementation of PasswordEncoder that uses the BCrypt strong hashing function. Password is encrypted before saving the database

## Environment

Operation System: Windows 10

Java Version: Java 8
 

