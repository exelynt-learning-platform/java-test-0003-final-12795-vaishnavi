/*Assignment Title
JAVA TEST 0002

Description
This assessment evaluates the candidate’s ability to implement number-based patterns using nested loops in Java. The candidate must create a program that correctly generates the required mirrored number pyramid.

Program
Write a Java program to print the following pattern exactly:

        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1

Evaluation Criteria
 */
    public class MirroredNumberPyramid {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

           
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}

