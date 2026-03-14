/*Assignment Title
JAVA TEST 0004

Description
This assessment evaluates the candidate’s understanding of matrix-style pattern generation and layered number logic using Java loops.

Candidates are required to develop a Java program that prints a concentric number square pattern. The solution must demonstrate the ability to handle multi-level loop control and number placement logic.

Program

Write a Java program to print the following pattern:

4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4 */
public class square_pattern {

    public static void main(String[] args) {

        int n = 4;                
        int size = 2 * n - 1;      

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {

                int top = i;
                int left = j;
                int right = size - 1 - j;
                int bottom = size - 1 - i;

                int min = Math.min(Math.min(top, bottom), Math.min(left, right));

                System.out.print((n - min) + " ");
            }

            System.out.println();
        }
    }
} 

