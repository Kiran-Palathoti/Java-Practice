// Find maximum element in an array

public class MaxElement{
    public static void maxi(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int[] arr = {5,3,1,7,9,2};
        maxi(arr);
    }
}