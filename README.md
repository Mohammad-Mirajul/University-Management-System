# University-Management-System

This project is a University EUniversity Management System designed as a desktop-based application. It provides a comprehensive solution for managing students, teachers, courses, examinations, and fees through a Java-based user interface.

This is my first project uploaded to GitHub, and I am excited to share it with the community! Any feedback or suggestions are greatly appreciated.

Features


1. Student Management

Add new students.

View student details.

Manage student leaves.


2. Teacher Management

Add new teachers.

View teacher details.

Manage teacher leaves.


3. Course Management

Add new courses.

View course details.

Manage course enrollments.


4. Examination Management

Create and manage examinations.

Enter and view student marks.


5. Fee Management

Define and manage fee structures.


Interface Files



Core Classes

Project.java: Main class for launching the application.

Conn.java: Database connection class.


Student Management Interfaces



AddStudent.java: Interface for adding new students.

StudentDetails.java: Interface for viewing student details.

StudentLeave.java: Interface for managing student leaves.

StudentLeaveDetails.java: Interface for viewing student leave details.



Teacher Management Interfaces

AddTeacher.java: Interface for adding new teachers.

TeacherDetails.java: Interface for viewing teacher details.

TeacherLeave.java: Interface for managing teacher leaves.



Course and Examination Management Interfaces

ExaminationDetails.java: Interface for viewing examination details.

EnterMarks.java: Interface for entering student marks.

Marks.java: Interface for viewing student marks.



Fee Management Interfaces

FeeStructure.java: Interface for defining and managing fee structures.



Additional Interfaces

About.java: About page with information about the system.

Login.java: Login interface for user authentication.

Splash.java: Splash screen for the application.



Development Tools

Programming Language: Java (Swing for UI design)

Database: MySQL for data storage

IDE: Apache NetBeans

Frameworks/Libraries: Java Swing, JFrame, AWT 



Installation

1.Clone the repository: git clone https://github.com/yourusername/university-management-system.git

2.Set up the database:

     Import the provided SQL script to create and initialize the database.

     Update the Conn.java file with your MySQL credentials.

3.Open the project in Apache NetBeans.

4.Build and run the application.



Contribution

1.Contributions are welcome! Please follow these steps:

2.Fork the repository.

3.Create a new branch for your feature or bug fix: git checkout -b feature-name

4.Commit your changes and push them to your branch: git commit -m "Description of changes"
git push origin feature-name

5.Submit a pull request.



License

Feel free to modify the project to meet your needs. Contributions to improve the application are appreciated!




