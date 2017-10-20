## Computer Science 1: Programming Assignment 1 (IN PROGRESS)

_first non-trivial programs in Java_

* * * 

_**School:** Metropolitan State University of Denver_

_**Course:** CS 1050 (aka CS 1)_

_**Term:** Fall 2017_

* * * 

### Goals

1. Write your first simple yet non-trivial standalone Java programs against explicit requirements.
2. Practice working in the IntelliJ IDEA integrated development environment (IDE).
3. Practice working with the version-control system `git` and the online development collaboration environment Github.
4. Practice programming against a test suite written in JUnit 5 library.
5. Practice class design.
6. Encounter a number of Java language features and best practices.
7. Start developing consistent coding style.

### Synopsis

This individual assignment consists of two separate and independent programs, _Calculator_ and _Pluralizer_. 

_Calculator_ asks you to develop a simple calculator class supporting the operations _addition_, _subtraction_, _multiplication_, _division_, and _modulo_.

_Pluralizer_ asks you to develop a simple class that, given English words, returns them in their plural form.

The assignment contains a test suite in the form of two classes, _CalculatorTest_ and _PluralizerTest_, containing JUnit 5 test methods. The requirement of the assignment is for all tests to pass.

### Submission

Submission of this assignment is via Github. The student should follow these steps:

1. Fork this repository on Github.
2. Clone their own fork to their local development environment via _git_.
3. Do their development locally, commiting often to keep track of their work.
4. When all tests are passed, do a final commit and push to the remote (their own fork of the repository).
5. Submit the URL of their own fork on Canvas.

Note that you can submit right after the first step and continue developing in comfort that you are not going to miss the deadline.

### Grading

Grading is based on the percentage of tests passed.

### Due date

Sun, Oct 29, 2017, by 23:59 Mountain Standard Time.

### Java and library versions

Java 1.8 or higher. JUnit 5 or higher.

### Honor code

Free Github repositories are public so you can look at each other's code before finishing and submitting. Please, don't do that. You can discuss any programming topics and the assignments in general but sharing of solutions diminishes the individual learning experience of many people. Assignments might be randomly checked for plagiarism and a plagiarism claim may be raised against you.

Note that PA1 is an _individual_ assignment.

### Detailed instructions

#### `Calculator`

Contrary to the prototypical assignment, this version will have to support:
  * both integers and decimals (doubles), by overloading
  * positive, negative, and zero values
  * modulo ONLY for integers
  * arbitrary white space between operands and operator, excluding new lines
  * parentheses for negative numbers
  * bonus: three operands w/ operator precedence


#### `Pluralizer`

In contrast from the prototypical version of the assignment:
  * the input will be words each of which might or might not be in singlular or plural form
  * there will be no integer count provided as input and the form of each input word has to be determined
  * irregular plurals are included
  * plural forms identical to the singular forms are included
