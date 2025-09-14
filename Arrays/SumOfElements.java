// Calculate sum of elements in an array

public class SumOfElements{
    public static int sumOfArray(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {4,2,5,1,3};
        int s = sumOfArray(arr);
        System.out.println(s);
    }
}