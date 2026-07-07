# Stage 0 report - Preparation
## 1.The Purpose of This Stage

The purpose of this stage was to set up the Java development environment, review the basic Java syntax,  and build a simple console-based application such as a calculator before moving on to Object-Oriented Programming.

In this stage, I focused on writing and running a Java program, using basic control structures, receiving user input from the console, tracing and managing my programming projects with Git and GitHub.

## 2. Topics I Reviewed and Practiced

At this stage, I reviewed and practiced the following topics:

- JDK and IntelliJ IDEA setup
- Creating and running a Java project
- `main` method
- Variables and primitive types
- `String`
- Arithmetic operators
- `if / else`
- `switch-case`
- `while` loop
- Methods, parameters, and return values
- `Scanner` for console input
- Basic exception handling with `try-catch`
- Git and GitHub basics

## 3. Application Developed

As the output of this stage, I developed a simple console-based calculator application.

The application can perform the following operations:

- Addition
- Subtraction
- Multiplication
- Division
- Exit from the program

The program keeps running until the user chooses the exit option. The code is divided into separate methods to make it more readable and easier to handle.


## 4. Error Handling and Input Validation

I added basic input validation and exception handling to make the program more stable.

The program now handles cases such as:

- Entering a non-numeric value when a menu option is expected
- Entering a non-numeric value when a number is expected
- Choosing an invalid menu option
- Trying to divide a number by zero

For division by zero, the program does not return a fake result such as `0`. Instead, it returns `null` and avoids printing an incorrect result.

This error handling is still basic. After reviewing Object-Oriented Programming in Stage 1, I plan to improve the structure of the program. In later stages, especially during Collections and Clean Code, I will revisit input validation and exception handling with a cleaner design.

## 5. GitHub Link

GitHub repository:
https://github.com/opheliadelrey13/java-summer-program

## 6. Difficulties I Faced

One difficulty was making the program continue running until the user chooses the exit option. I solved this by using a `while` loop.
Another difficulty was handling invalid user input. At first, the program could crash when the user entered text instead of a number. I improved this by using `try-catch` blocks and helper methods such as `readInt` and `readDouble`.
I also improved the division operation because returning `0` after a division by zero error was not a good solution. Instead, I used `Double` and returned `null` when the division was invalid.

## 7. General Evaluation

At the end of Stage 0, I can create and run a basic Java console application. I practiced the fundamental Java concepts and used them together in a small project.
