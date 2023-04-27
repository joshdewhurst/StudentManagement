# Student Management System
This is a simple student management system written in Java. It allows users to add, delete, and update student information, as well as view student data and calculate average marks.

![Code Demo](./Java Student Management System (online-video-cutter.com).mp4)


## Technical Elements
### Student Class
The **Student** class has three private instance variables: **name**, **rollNumber**, and **marks**. It also has a constructor that initializes these variables. Additionally, it has getter and setter methods for these variables.

### StudentDatabase Class
The **StudentDatabase** class is responsible for managing the collection of **Student** objects. It has methods to add a new student, delete a student, update a student's marks, print student data, and calculate average marks. These methods use a list of **Student** objects to store the student data.

### StudentManagementSystem Class
The **StudentManagementSystem** class is the main class of the program. It instantiates a new **StudentDatabase** object and adds some initial data to it. It then displays a menu and prompts the user to select an option. Depending on the user's choice, it calls the appropriate method of the **StudentDatabase** class.

## How to Use
To run this program, you will need to have Java installed on your computer. You can clone this repository by using the following command:

`git clone https://github.com/joshdewhurst/StudentManagement.git`

Once you have cloned the repository, navigate to the directory containing the code and compile the code using the following commands:
`javac Student.java`
`javac StudentDatabase.java`
`javac StudentManagementSystem.java`

After successfully compiling the code, you can run the program by using the following command:

`java StudentManagementSystem`

This will start the program and display the menu. From there, you can follow the prompts to manage the student data.
