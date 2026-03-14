/*Assignment Title
JAVA TEST 0003

Description
This test evaluates the candidate’s understanding of conditional logic and alternating value patterns in Java.
The candidate must implement a Java program that prints the required binary triangle pattern using nested loops and logical conditions. The output must strictly follow the pattern structure provided.
Program
Write a Java program to print the following pattern:

1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
0 1 0 1 0 1 */
public class trangularPattern{
    public static void main(String[] args){
        int rows = 6;
        for(int i =1 ; i<=rows;i++){
            int num;
             if(i%2 == 1){
                num=1;
             }
             else{
                num = 0;
             }
             for(int j = 1; j<=i;j++){
                System.out.print(num);
                num = (num == 1)?0:1;
             }
             System.out.println();
        }
    }
}