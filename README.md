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
- A relational database (e.g., MySQL, PostgreSQL)![Screenshot 2024-11-20 164454](https://github.com/user-attachments/assets/07889c01-6c68-47ff-a607-5d37e4707ac9)
![Screenshot 2024-11-20 164443](https://github.com/user-attachments/assets/eade0f4a-429e-468e-9fcf-efe1d58751a6)
![Screenshot 2024-11-20 164429](https://github.com/user-attachments/assets/4366c7be-d515-4faa-8189-e6a678cf939a)
![Screenshot 2024-11-20 164402](https://github.com/user-attachments/assets/95be8561-d676-44c4-a125-9a774fc26afa)
![Screenshot 2024-11-20 163456](https://github.com/user-attachments/assets/0dda2f95-24a8-4d72-b5a9-80395582b3c8)
![Screenshot 2024-11-20 163420](https://github.com/user-attachments/assets/3d25fc3e-cee0-41f3-94a5-3250a7cf8269)

