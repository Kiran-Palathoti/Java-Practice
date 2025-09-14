// Find minimum element in an array

public class MinElement {
    public static void mini(int[] arr){
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
    public static void main(String[] args) {
        int[] arr = {4,2,6,1,2};
        mini(arr);
    }
}
