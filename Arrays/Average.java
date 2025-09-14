// Calculate average of elements in an array

public class Average {
    public static int averageOfElements(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum/arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int avg = averageOfElements(arr);
        System.out.println(avg);
    }
}
