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
### Login page
![Screenshot 2024-11-20 163420](https://github.com/user-attachments/assets/db30056e-c94f-42c9-98de-466d322b27ea)
### If wrong credentials are passed
![Screenshot 2024-11-20 163456](https://github.com/user-attachments/assets/83d227cc-e3b2-4c87-ae7f-632777727db0)
### Employee DashBoard
![Screenshot 2024-11-20 164402](https://github.com/user-attachments/assets/e2bf8da9-e03b-421e-9cf7-bcee070bd987)
-In this Employee can see the tasks assigned to him, by clicking on the completed button, assigned task will be removed.
### Admin DashBoard
![Screenshot 2024-11-20 164429](https://github.com/user-attachments/assets/15d927f8-83f7-426b-8ac5-25df05978572)
-In this Admin can see the tasks he/she has to done and an employee directory link to manage other employees
### Employee Directory
![Screenshot 2024-11-20 164443](https://github.com/user-attachments/assets/d423502f-60b0-4129-bd71-e4e117f7728a)
-By click on add employee, admin can add new Employee.
A default username and password be be authmatically generated 
- Admin can update and delete employee using buttons provided in the action column
- Admin can assign task and remove the assigned tasks
### Add Employee Form
![Screenshot 2024-11-20 164454](https://github.com/user-attachments/assets/7dc9406f-ade5-48d8-b7a2-ebc68c02b546)







