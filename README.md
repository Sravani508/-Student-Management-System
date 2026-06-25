# 🎓 Student Management System (Java + MySQL)

A console-based **Student Management System** built using **Java, JDBC, and MySQL**.  
This project performs complete **CRUD operations** and follows a clean layered architecture using the **DAO pattern**.

---

## 🚀 Features
- Add a new student
- View all students
- Update student details
- Delete a student
- MySQL database integration using JDBC
- Clean and modular project structure

---

## 🛠 Technologies Used
- **Java (JDK 22)**
- **MySQL 8**
- **JDBC**
- **VS Code**
- **Git & GitHub**

---

## 📂 Project Structure
Student Management System
│
├── src
│ └── com.sms
│ ├── main → Application entry point
│ ├── dao → Database operations (CRUD)
│ ├── model → Student entity
│ └── util → Database connection utility
│
├── lib
│ └── mysql-connector-j-9.6.0.jar
│
└── README.md

---

## ▶️ How to Run the Project
1. Install Java (JDK 17+ recommended)
2. Install MySQL Server and MySQL Workbench
3. Create the database and table using the SQL above
4. Update database credentials in `DBConnection.java`
5. Run `MainApp.java`
6. Use the console menu to manage students

---

## 🧠 Concepts Used
- JDBC
- DAO Pattern
- PreparedStatement
- MySQL Database
- OOP (Encapsulation, Abstraction)
- Exception Handling

---

## 📌 Future Enhancements
- Convert to Spring Boot
- Add REST APIs
- Add Login & Authentication
- Web-based UI

---

## 👨‍💻 Author
**Siraj Mohammad**  
GitHub: https://github.com/Sirajmohammad03
  

---

## 🧩 Database Schema
```md
```sql
CREATE DATABASE student_db;
USE student_db;

CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE,
    course VARCHAR(100),
    marks DOUBLE
);




