# Contact Form Application

A full-stack Contact Form application developed using Spring Boot, MySQL, HTML, CSS, and JavaScript. The application allows users to submit contact information, stores the data in a MySQL database, and provides a REST API to retrieve all submitted contacts in JSON format.

## Features

* Contact form with:

  * Name
  * Email
  * Message
* Store contact details in MySQL database
* REST API for retrieving all contacts
* Spring Data JPA integration
* Hibernate ORM for database operations
* JSON response support
* Maven-based project structure

## Technologies Used

### Backend

* Java 17
* Spring Boot
* Spring Data JPA
* Hibernate
* Maven

### Database

* MySQL

### Frontend

* HTML
* CSS
* JavaScript

### Version Control

* Git
* GitHub

## Project Structure

```text
backend/
│
├── controller/
│   └── ContactController.java
│
├── entity/
│   └── Contact.java
│
├── repository/
│   └── ContactRepository.java
│
├── resources/
│   └── application.properties
│
└── BackendApplication.java
```

## Database Configuration

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/contactdb
spring.datasource.username=springuser
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## API Endpoints

### Save Contact

```http
POST /contact
```

Parameters:

```text
name
email
message
```

Response:

```text
Contact Saved Successfully
```

### Get All Contacts

```http
GET /contacts
```

Sample Response:

```json
[
  {
    "id": 1,
    "name": "Akash",
    "email": "akash@gmail.com",
    "message": "Hello"
  }
]
```

## How to Run

### Clone Repository

```bash
git clone <repository-url>
cd backend
```

### Install Dependencies

```bash
./mvnw clean install
```

### Run Application

```bash
./mvnw spring-boot:run
```

Application runs on:

```text
http://localhost:8080
```

## Database Verification

Login to MySQL:

```bash
mysql -u springuser -p
```

Select database:

```sql
USE contactdb;
```

View records:

```sql
SELECT * FROM contacts;
```

## Learning Outcomes

* Spring Boot project setup
* MySQL integration with Spring Data JPA
* Hibernate ORM concepts
* REST API development
* CRUD foundations
* Maven dependency management
* Git and GitHub workflow

## Author

Akash N
B.Tech Computer Science Engineering
Internship Project – Task 2
