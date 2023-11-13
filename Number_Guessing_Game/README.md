# Number Guessing Game in Java

## Overview
This Java program implements a simple number guessing game. The user is prompted to guess a randomly chosen number between 1 and 100 within a specified number of trials. The program provides feedback on each guess, indicating whether the correct number is greater or less than the guess. If the user cannot guess the correct number within the allotted trials, the program reveals the correct answer.

## How to Play
1. **Run the Program:**
   - Compile and run the `Numbergame.java` file.
   ```bash
   javac Numbergame.java
   java Numbergame
   ```

2. **Enter Number of Trials:**
   - You will be asked to enter the number of trials you want to attempt.

3. **Guess the Number:**
   - Enter your guess when prompted.
   - You will receive feedback on whether the correct number is greater or less than your guess.

4. **Win or Lose:**
   - If you guess the correct number within the specified number of trials, you win!
   - If you exhaust all trials without guessing correctly, the correct number will be revealed, and you lose.

## Code Explanation
The program utilizes a random number generator, loops for user input, and provides conditional statements for feedback. The main components of the code include:
- User input for the number of trials.
- Generation of a random number between 1 and 100.
- A loop for user guesses and feedback.
- Display of the result (win/lose) and the correct number if the user loses.

Feel free to fork the project, contribute, and enjoy the game! Happy coding!
