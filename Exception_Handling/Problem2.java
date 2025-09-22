/*
 * Multiple Exceptions
Write a program where:

User enters two integers, divide them.

Also try to access an invalid index in an array.

Use multiple catch blocks (ArithmeticException, ArrayIndexOutOfBoundsException).
 */

import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter num 2: ");
        int n2 = sc.nextInt();
        int[] arr = {1,2,3,4,5};

        try {
            int i = n1/n2;
            System.out.println("Output:" +i);
            System.out.println(arr[1]);
            String s = null;
            System.out.println(s.length());
        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Cannot access index that is not in range");
        }
        catch(Exception e){
            System.out.println("Some other error occurred: " + e);
        }
        finally{
            System.out.println("Always Executes");
        }
        sc.close();
    }
}
