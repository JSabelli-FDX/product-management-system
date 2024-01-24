# Product Management System

This is a simple product management system built with Java, Hibernate, Spring Boot MVC, Thymeleaf, and Maven.

## Prerequisites

Before you begin, ensure you have met the following requirements:

* You have installed the latest version of [Java JDK 17](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html), [Maven](https://maven.apache.org/download.cgi), [MySQL Server](https://dev.mysql.com/downloads/mysql/), and [MySQL Workbench](https://dev.mysql.com/downloads/workbench/).
* You have a Windows machine. This guide is tailored for Windows users.
* You have read the [Spring Boot documentation](https://spring.io/projects/spring-boot).

## Setting up the Product Management System

To set up the Product Management System, follow these steps:

1. Clone this repository to your local machine.
2. Install and set up the MySQL server and MySQL Workbench. Create a database named `pms` and a user with the username `root` and password `admin`. Hostname should be `localhost` and port `3306`.
3. Navigate to the root directory of the project in your terminal.
4. Run `mvn clean install` to build the project and install dependencies.

## Running the Product Management System

To run the Product Management System, follow these steps:

1. Navigate to the root directory of the project in your terminal.
2. Run `mvn spring-boot:run` to start the application.
3. Open your web browser and visit `http://localhost:8080/products`.

## Using the Product Management System

1. On the homepage, you can view all the products.
2. Use the navigation bar to create, edit, or delete products.

## Contributing to the Product Management System

To contribute to the Product Management System, follow these steps:

1. Fork this repository.
2. Create a branch: `git checkout -b <branch_name>`.
3. Make your changes and commit them: `git commit -m '<commit_message>'`
4. Push to the original branch: `git push origin <project_name>/<location>`
5. Create the pull request.

## Contact

If you would like to contact me, you can reach me at `jmsabelli8@gmail.com`.
