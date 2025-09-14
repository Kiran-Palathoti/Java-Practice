// Reverse an array

public class ReverseArray {
    public static void arrayReverse(int[] arr){
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        arrayReverse(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
