  Spring Security Demo (Spring Boot)

A simple project demonstrating authentication and authorization using Spring Security in a Spring Boot application.

This project shows how to secure REST endpoints, configure login authentication, and create in-memory users.

🚀 Features

✔ Secure REST endpoints using Spring Security
✔ Configure authentication with in-memory users
✔ Allow public and protected endpoints
✔ Use the default Spring Security login page
✔ Demonstrates SecurityFilterChain configuration

🧰 Tech Stack

Java

Spring Boot

Spring Security

Maven

REST APIs

📂 Project Structure
spring-security-demo
│
├── src/main/java/com/example/spring_security_demo
│   │
│   ├── SpringSecurityAuthentication.java   # Security configuration
│   └── DemoController.java                 # REST endpoints
│
├── src/main/resources
│   └── application.properties
│
└── pom.xml
🔑 Security Configuration

The application defines a SecurityFilterChain to control access to endpoints.

Public Endpoints

Accessible without authentication:

/
 /one
Protected Endpoints

Require user login:

/two
/three

If a user tries to access a protected endpoint without logging in, they will be redirected to the Spring Security login page.

👤 Default Users

The application uses InMemoryUserDetailsManager, meaning users are stored in memory.

User 1
Username: testUserOne
Password: password
Role: USER
User 2
Username: testUserTwo
Password: passwordtwo
Role: USER
🌐 API Endpoints
Endpoint	Description	Access
/	Demo Home	Public
/one	Demo Endpoint One	Public
/two	Demo Endpoint Two	Login Required
/three	Demo Endpoint Three	Login Required
▶️ Running the Project
1️⃣ Clone the repository
git clone https://github.com/your-username/spring-security-demo.git
2️⃣ Navigate into the project
cd spring-security-demo
3️⃣ Run the application
mvn spring-boot:run
4️⃣ Open in browser
http://localhost:8080
🔄 Authentication Flow

User accesses a protected endpoint

Spring Security redirects to login page

User enters credentials

If authentication succeeds → access granted

⚠️ Important Note

This project uses:

User.withDefaultPasswordEncoder()

This is only for learning purposes.

For production applications, passwords should be encrypted using:

BCryptPasswordEncoder
📚 Learning Objectives

This project helps developers understand:

Spring Security configuration

Authentication vs Authorization

Securing REST APIs

Creating users without a database`
