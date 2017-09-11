# Lab 1: Fizz Buzz

## Running the Application

```
./gradlew run -PappArgs="['17']"
```

## Running the Tests

```
./gradlew test
```

## Overview
You will work in pairs on various versions of fizz buzz.
## Objectives
An understanding of the following concepts and techniques:
Software requirements
Combining branching and looping
Basic input/output
Using arrays to store and retrieve data
Writing testable code and automated testing
Refactoring
Using lists to store and retrieve data
Version control
## Part 0
Create a GitHub account if you don’t have one already.
## Part 1
Form a team of size two (pair) with another classmate. Work as a pair on the remainder of this lab. Follow the GitHub classroom invitation link provided on Slack and create/select your team. Keep your work for this lab activity in your team repository.
## Part 2
Functional requirements: Develop a Java program that behaves as follows ():
It expects a natural number (positive integer), n, as its first command-line argument.
It determines and prints the fizz buzz sequence up to n, one number per line, on the standard output.
Nonfunctional requirements: Your program should be a Gradle project; this happens automatically when creating it through IntelliJ IDEA. Reference project: https://github.com/LoyolaChicagoCode/hello-java 
For example, for n = 17, the program would produce the following output:
1
2
fizz
4
buzz
fizz
7
8
fizz
buzz
11
fizz
13
14
fizz buzz
16
17
Don’t forget to commit and push your work!
Discussion: What would be a really simple solution if n were not an argument, i.e., if it were always 17?
## Part 3
Now refactor (change the structure without changing the behavior) of your solution in such a way that it becomes testable:
Create an additional method fizzBuzz that takes a numeric argument n.
Change the main method so that it is responsible only for converting the command-line argument to a number and passing it to n.
Now change the method fizzBuzz in such a way that it no longer prints anything but instead stores the resulting data in an array and returns that array.
Finally, write a test suite that expresses and tests the correctness of method fizzBuzz for the following values of n:
-10
-1
0
1
7
17
Nonfunctional requirements: use JUnit 4.x.
Don’t forget to commit and push your work!
Discussion: How could you have automatically tested your initial solution from part 2?
## Part 4
Copy your solution to part 3 and refactor it to use a list instead of an array.
Don’t forget to commit and push your work!
Discussion: What changes between parts 2, 3, and 4, and what stays the same? Does it matter what list implementation you choose? If so, in what way(s)?
## Part 5
Create a text document using your preferred tool. For each discussion item, write a brief paragraph with your findings. Add a PDF of your document to your team repository.
Don’t forget to commit and push your work!

