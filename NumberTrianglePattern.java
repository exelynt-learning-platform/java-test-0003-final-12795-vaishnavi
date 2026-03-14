/*Assignment Title
JAVA TEST 0005

Description
This assessment evaluates the candidate’s ability to apply intermediate Java programming concepts, including nested loops, logical reasoning, pattern design, and structured output formatting.

Candidates are required to develop a Java program that generates the specified pattern exactly as shown. The solution should demonstrate proper use of loop control, conditional logic, and systematic pattern construction.

Program

Write a Java program to print the following pattern exactly:

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15 */

public class NumberTrianglePattern {

    public static void main(String[] args) {

        int num = 1;

        for (int i = 1; i <= 5; i++) {   // rows
            for (int j = 1; j <= i; j++) {  // numbers in each row
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}

