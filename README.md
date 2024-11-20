# Employee Management System

A web-based **Employee Management System** built using **Spring Boot**, **JPA**, **Hibernate**, **Spring Security**, and **Spring MVC**. The system is designed to streamline employee and task management while providing role-based access control for different types of users.

## Features

- **Role-Based Authentication**:
  - **Employee**: Can view and manage their assigned tasks.
  - **Manager**: Can assign tasks, delete tasks, and update employee details.
  - **Admin**: Full access to assign tasks, delete employees, promote employees to managers, and manage the entire system.

- **Task Management**:
  - Employees can track their assigned tasks and update their status.
  - Managers can assign, update, and delete tasks for employees.
  - Admins can assign tasks to any employee and manage task assignments across the organization.

- **Employee Management**:
  - Managers can update employee details such as roles and tasks.
  - Admins can add, delete, and update employee records and promote employees to managerial roles.

## Technology Stack

- **Backend**: 
  - **Spring Boot**: Framework for building the application.
  - **Spring Security**: Authentication and authorization based on roles.
  - **JPA & Hibernate**: For managing database interactions and object-relational mapping.
  - **Spring MVC**: For building the web layer using the Model-View-Controller design pattern.

- **Database**: A relational database to store entities like Employees, Tasks, and Roles.

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven
- A relational database (e.g., MySQL, PostgreSQL)
## Some Insights of the Application
![Screenshot 2024-11-20 164454](https://github.com/user-attachments/assets/10cf8474-2ea3-4a54-81ca-257d618b8b55)
![Screenshot 2024-11-20 164443](https://github.com/user-attachments/assets/2f6556a5-c074-4a60-b278-39451bebefad)
![Screenshot 2024-11-20 164429](https://github.com/user-attachments/assets/d27c3953-84f8-4617-b271-b1046a6b6f16)
![Screenshot 2024-11-20 164402](https://github.com/user-attachments/assets/70476884-2246-48b3-b66f-ae9c1f45f054)
![Screenshot 2024-11-20 163456](https://github.com/user-attachments/assets/15e4c820-0967-47c6-b6c8-407dc0fcd272)
![Screenshot 2024-11-20 163420](https://github.com/user-attachments/assets/671446bf-118e-436a-8daa-03bf4cece436)

