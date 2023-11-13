# Student Grade Calculator in Java

## Overview
This Java program serves as a simple student grade calculator. It takes user input for the number of subjects, prompts for marks in each subject out of 100, calculates the total marks, average percentage, and assigns a letter grade based on the average percentage. The program provides a summary of the results, including total marks, average percentage, and the corresponding letter grade.

## How to Use
1. **Run the Program:**
   - Compile and run the `studentgradecalculator.java` file.
   ```bash
   javac studentgradecalculator.java
   java studentgradecalculator
   ```

2. **Enter Number of Subjects:**
   - You will be prompted to enter the number of subjects for which you want to calculate grades.

3. **Input Marks:**
   - Enter the marks for each subject when prompted.

4. **View Results:**
   - The program will display the total marks, average percentage, and the corresponding letter grade.

## Code Explanation
The key features of the code include:
- Input validation for the number of subjects.
- A loop to take marks for each subject and calculate the total marks.
- Calculation of average percentage and determination of the letter grade using a separate method.
- Display of results including total marks, average percentage, and letter grade.

## Sample Code Snippet
```java
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // ... (user input and calculations)

    char grade = calculateGrade(averagePercentage);

    // ... (displaying results)
}
```

## Grade Calculation Method
```java
private static char calculateGrade(double averagePercentage) {
    if (averagePercentage >= 90) {
        return 'A';
    } else if (averagePercentage >= 80) {
        return 'B';
    } else if (averagePercentage >= 70) {
        return 'C';
    } else if (averagePercentage >= 60) {
        return 'D';
    } else {
        return 'F';
    }
}
```

## License
This project is licensed under the [MIT License](LICENSE).

Feel free to modify and use the code for educational purposes. Contributions are welcome! Happy coding!
