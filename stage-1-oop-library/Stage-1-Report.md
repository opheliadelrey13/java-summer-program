# Stage 1 Report - Object-Oriented Programming

## 1.Purpose of This Stage

The purpose of this stage was to understand and practice the main concepts of Object-Oriented Programming in Java. I focused on designing a small console-based application by creating classes, each with its own responsibility and applying the four main Object-Oriented Programming principles: encapsulation, inheritance, polymorphism, and abstraction.

As the output of this stage, I developed a simple Library Management System.

## 2.Topics I Learned and Practiced

During this stage, I practiced the following Object-Oriented Programming concepts:

- Class and Object
- Field and method
- Constructor
- `this` keyword
- Encapsulation
- Access modifiers
- Getter methods
- Inheritance with `extends`
- Superclass and subclass relationship
- `super` keyword
- Method overriding
- Polymorphism
- Abstract class
- Interface
- `implements` keyword

## 3.Application Developed

I developed a console-based Library Management System.

The application includes the following classes:
- `Main`
- `Library`
- `LibraryItem`
- `Book`
- `Magazine`
- `Borrowable`

The application can:
- Add books to the library
- Add magazines to the library
- List all library items
- Find an item by ID
- Borrow an item by ID
- Return an item by ID
- Show whether an item is available or borrowed

## 4.How I Applied OOP Principles

### Encapsulation

I used encapsulation by making fields private and accessing them through methods.For example, fields such as `id`,`title` and `borrowed` are kept private inside the `LibraryItem` class.The borrowed status is not changed directly from outside the class. Instead,it is controlled through methods such as `borrow()` and `returnBorrowed()`. This makes the program safer and more controlled.

### Inheritance

I used inheritance by creating a common parent class called `LibraryItem`. Both `Book` and `Magazine` extends `LibraryItem` because they share common properties such as ID, title, and borrowed status.
This helped me avoid code duplication by keeping common behavior in one place, making the code easier to organize and maintain.

### Polymorphism

I used polymorphism by storing different item types as `LibraryItem`. For example, the `Library` class stores both `Book` and `Magazine` objects inside a `List<LibraryItem>`.When `printInfo()` is called, Java runs the correct version of the method depending on the actual object type.
This allowed the program to manage different item types through a common parent type.

### Abstraction

I used abstraction with both an abstract class an interface.
`LibraryItem` is an abstract class because it represents a general library item, not a specific object by itself.`Book` and `Magazine` are concrete item types.
I also used the `Borrowable` interface to represent the behavior of items that can be borrowed and returned.

## 5.GitHub Link

GitHub repository:

https://github.com/opheliadelrey13/java-summer-program

## 6.Difficulties I Faced

One difficulty was understanding how the classes should be separated and why each class was needed. At first, it was not clear why `LibraryItem`, `Book`, `Magazine`, and `Library` should be different classes.
I understood that `LibraryItem` is used for common properties, while `Book` and `Magazine` are specific item types. I also understood that the `Library` class should manage the list of items instead of putting all the logic inside `Main`.

## 7.General Evaluation

At the end of the Stage 1, I have a better understanding of Object-Oriented Programming in Java. I learned how to model a real-world problem using classes and objects.
This project helped me understand why code should be separated into meaningful classes and how OOP principles make the code more organized, reusable, and easier to maintain.


