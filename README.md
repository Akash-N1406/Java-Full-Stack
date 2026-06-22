# Contact Form Web Application

## Project Overview

This project is a simple Full Stack Web Application developed using HTML, CSS, Java, and Spring Boot. The application consists of a responsive landing page with a contact form that allows users to submit their Name, Email, and Message.

The frontend is developed using HTML and CSS, while the backend is built using Spring Boot. When a user submits the form, the backend receives the data and displays it in the console.

---

## Objectives

* Create a responsive landing page.
* Design a contact form using HTML and CSS.
* Develop a Spring Boot backend.
* Handle form submissions using a Controller.
* Receive and process user data.
* Display submitted information in the backend console.

---

## Technologies Used

### Frontend

* HTML5
* CSS3

### Backend

* Java
* Spring Boot
* Spring Web

### Tools

* Visual Studio Code
* Git
* GitHub
* Maven

---

## Project Structure

```text
Java-FullStack-Task1
│
├── frontend
│   ├── index.html
│   └── style.css
│
└── backend
    │
    ├── pom.xml
    │
    └── src
        └── main
            └── java
                │
                ├── BackendApplication.java
                │
                └── controller
                    └── ContactController.java
```

---

## Features

### Landing Page

* Modern user interface
* Responsive design
* Gradient background
* Hero section

### Contact Form

* Name field
* Email field
* Message field
* Submit button
* Form validation using `required`

### Backend Processing

* Spring Boot application
* REST Controller
* POST request handling
* Console output of submitted data

---

## Backend Endpoint

### POST /contact

Receives the following parameters:

| Parameter | Description          |
| --------- | -------------------- |
| name      | User's name          |
| email     | User's email address |
| message   | User's message       |

Example:

```text
Name: Akash
Email: akash@gmail.com
Message: Hello Internship
```

---

## How to Run the Project

### Frontend

1. Open the frontend folder.
2. Open `index.html` using Live Server or a browser.
3. Fill out the contact form.

### Backend

1. Navigate to the backend folder.

```bash
cd backend
```

2. Run the Spring Boot application.

```bash
./mvnw spring-boot:run
```

3. Open the frontend page and submit the form.

4. View submitted data in the terminal.

---

## Sample Output

### Browser

```text
Form Submitted Successfully
```

### Console

```text
Name: Akash

Email: akash@gmail.com

Message: Hello Internship
```

---

## Concepts Learned

* HTML Structure
* CSS Styling
* Responsive Design
* Forms and Input Fields
* HTTP Requests
* GET and POST Methods
* Spring Boot Framework
* REST Controllers
* Request Parameters
* Maven Dependency Management
* Full Stack Application Development
* Git and GitHub Version Control

---

## Future Improvements

* Store submissions in a database.
* Add form success page.
* Add email notifications.
* Improve frontend responsiveness.
* Implement client-side JavaScript validation.

---

## Author

Akash

Java Full Stack Internship - Week 1 Task

Contact Form Web Application
