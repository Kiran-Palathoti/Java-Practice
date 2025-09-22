public class Example {
    public static void main(String[] args) {
        int i=2;
        int j= 0;
        try{
            j = 20/i;
            int[] arr = new int[5];
            System.out.println(arr[5]); // raises an error because we are trying to access the index that is not in the array
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero"+e); // prints the exception that has occured in the code block
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Cannot access the index that is not in the array");
        }
        catch (Exception e) {
            System.out.println("General Exception caught.");
        }
        System.out.println(j);
        System.out.println("Done...");
    }
}
