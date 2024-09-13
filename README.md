# CRUD
CRUD example for application test with Python Application

Database Setup

For users(sql table)

CREATE TABLE users (
    username VARCHAR(50) PRIMARY KEY,
    password VARCHAR(255),
    active BOOLEAN
);


Dependencies: Ensure you have the MySQL JDBC driver in your classpath. If using Maven, add this to your pom.xml

<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.29</version>
</dependency>
