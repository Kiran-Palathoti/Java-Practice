

public class SecondLargest {
    public static int second(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLarge = largest;
                largest = arr[i];
            }
            else if(arr[i]>secondLarge && arr[i]!=largest){
                secondLarge = arr[i];
            }
        }
        return secondLarge;
    }

    public static void main(String[] args) {
        int[] arr = {4,2,6,1,7,8,9};
        int s = second(arr);
        System.out.println(s);
    }
}
