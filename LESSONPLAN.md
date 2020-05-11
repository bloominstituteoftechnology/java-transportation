#### Entry Ticket

Please take a moment to reflect on what you have previously learned and hope to learn by completing this Google Survey. Remember your responses will be read by your instructor to help guide future lessons.

* [Guided Project Entry Ticket](https://forms.gle/49oq7PNKsLs4kgA7A)

#### Daily Resources

* No Guided Project Starter - built from scratch
* [Slido](https://app.sli.do/event/XXXXXXXX)
* [Zoom like](https://lambdaschool.zoom.us/j/#########)

#### Slack Message

@channel
Let's do this! The Java Class will be starting in 3 minutes at (https://lambdaschool.zoom.us/j/#########)
Please post questions to the Slido link at (https://app.sli.do/event/XXXXXXXX)

### Introduction and Hook

So what is the deal with being object oriented? Let's look at how that can help us!

Quick recap

* Interfaces
  * Used frequently but no fields
  * child classes can inherit from multiple interfaces
* Abstract Classes
  * Can have fields!
  * child classes can only inherit from one abstract class

### Purpose

We are going to look at some useful object oriented properties of Java! 

### Learning Activities

Create an application called `transportation` and a package called `transport`

```BASH
<home dir><work dir>/transportation/src/transport
```

Enter the following code into a file in the `transport` folder called `Main.java`. This is just to get started

```JAVA
package transport;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Lambda School's Java Module 3!!!");
    }
}
```

To run our code, we go through the following steps, running these commands from the `src` directory. These are steps to repeat after each change of the source code

```BASH
javac transport/*.java
jar cvfe transport.jar transport.Main transport/*.class
java -jar transport.jar
```

So the order is

* Convert to bytecode
* Archive to a single file
* Execute the program

Remember

* c – create new archive file with the given name
* v – generate verbose output
* f – specifies the jar output file to be created
* e – sets the main class also called the entry point

#### Working with the Objective: Use and implement interfaces

Create the interface Animal.java

Create the interface Vehicle.java

Create the class Horse.java

In Main.java add the sections regarding interfaces

* [Check for Understanding CFU - Google Form](https://forms.gle/oWVe3NtdLunbmY2P9)

#### Working with the Objective: Use and implement abstract classes

Create the Abstract Class AbstractVehicle.java

Create the class HorseFromVehicle.java

Create the class Auto.java

In Main.java add the sections regarding abstract classes. Especially highlight the part about combining child classes

* [Check for Understanding CFU - Google Form](https://forms.gle/pGgRH8DjbC872h9r6)

#### Working with the Objective: Use and implement Lambda Expressions

Create the interface CheckVehicle.java

In Main.java add printVehicles

In Main.java add the sections regarding Lambda Expressions

* [Check for Understanding CFU - Google Form](https://forms.gle/KUub95eT5sCLPFPx5)

### Objective to Cover if Time Permits

Remember all get covered!

#### Conclusion

##### Review what we just learned

Today we covered some fundamental object oriented constructs of Java, useful constructs we will be using as we go forward!

* Interfaces
* Abstract classes
* Lambda Expressions

##### How is this related to tomorrow's topic

* Tomorrow we introduce a variety of topics that will help us in Web Programming with Java
  * IntelliJ - the Integrated Development Environment we will be using
  * Maven - The application manager, think yarn or npm for JavaScript
  * Spring - A framework which makes heavy use of interfaces
  * and much more so stay tuned!

### Exit Ticket

Please take a moment to reflect on what you have learned in today's Guided Project. Remember your response will be read by your instructor to help guide future lessons.

* [Guided Project Exit Ticket](https://forms.gle/Li9aU1KKDqaBnyVY8)
