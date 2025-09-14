// Find an element in an array

public class LinearSearch {
    public static void search(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Elements found at index: "+i);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,2,5,1,6,9,7};
        int target = 2;
        search(arr,target);
    }
}
