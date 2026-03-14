/*Assignment Title
JAVA TEST 0001

Description
This assessment evaluates the candidate’s understanding of Java nested loops, spacing control, and pattern construction. Candidates are required to develop a Java program that generates the specified pattern exactly as shown.

The solution should demonstrate proper use of loop structures, logical problem-solving, and output formatting. The output must match the required pattern precisely, including spaces and alignment.
Program

Write a Java program to print the following pattern exactly:

    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    **/
   public class DiamondPattern {

    public static void main(String[] args) {

        int n = 5;

        
        for (int i = 1; i <= n; i++) {

            
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            System.out.print("*");

            if (i > 1) {
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {

            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            System.out.print("*");

            if (i > 1) {
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }
    }
}