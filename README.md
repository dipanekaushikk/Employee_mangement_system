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
