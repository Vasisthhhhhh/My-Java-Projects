# Number Guessing Game

## Overview
This project is a simple **Number Guessing Game** implemented in Java. The program generates a random number between 0 and 99, and the user is tasked with guessing the number. The game provides feedback on whether the user's guess is too high, too low, or correct. The user can exit the game at any time by entering `-1`.

## Features
- Random number generation between 0 and 99.
- User input validation using the 

Scanner

 class.
- Feedback on whether the guess is too high, too low, or correct.
- Option to exit the game by entering `-1`.
- Displays the correct number if the user exits the game.

## Project Structure
```
project/
    main.java
    main.class
```

### Key Files
- **main.java**: Contains the implementation of the Number Guessing Game.
- **main.class**: Compiled bytecode of the 

main.java

 file.

## How to Run
1. **Compile the Code**:
   Open a terminal in the 

project

 directory and run:
   ```sh
   javac main.java
   ```
   This will generate the 

main.class

 file.

2. **Run the Game**:
   Execute the compiled program using:
   ```sh
   java main
   ```

3. **Gameplay**:
   - Follow the prompts to guess the number.
   - Enter `-1` to exit the game.

## Code Explanation
The main logic is implemented in the 

main

 class:
- **Random Number Generation**:
  ```java
  int myNum = (int)(Math.random() * 100);
  ```
  This generates a random number between 0 and 99.

- **User Input**:
  ```java
  Scanner sc = new Scanner(System.in);
  userNumber = sc.nextInt();
  ```
  The program uses the 

Scanner

 class to read user input.

- **Game Loop**:
  ```java
  do {
      // Logic for guessing and feedback
  } while(userNumber != -1);
  ```
  The loop continues until the user guesses the correct number or exits the game.

- **Feedback**:
  - If the guess is correct:
    ```java
    System.out.println("WOHOOO! CORRECT NUMBER!");
    ```
  - If the guess is too small:
    ```java
    System.out.println("Your number is too small. Try again.");
    ```
  - If the guess is too large:
    ```java
    System.out.println("Your number is too large. Try again.");
    ```

- **Exit Message**:
  ```java
  System.out.println("You exited the game. The correct number was: " + myNum);
  ```

## Requirements
- Java Development Kit (JDK) installed.
- A terminal or IDE like Visual Studio Code to compile and run the program.

## License
This project is open-source and can be used freely for educational purposes.

## Author
This project was implemented as part of a Java learning exercise.
