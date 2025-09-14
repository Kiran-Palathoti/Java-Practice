
//     public static int[] copyArray(int[] arr){
//         int[] newArr = new int[arr.length];
//         for(int i=0;i<arr.length;i++){
//             newArr[i] = arr[i];
//         }
//         return newArr;
//     }
//     public static void main(String[] args) {
//         int[] arr1 = {3,4,5,6,7,8,1};
//         int[] arr2 = copyArray(arr1);

//         System.out.println("New Array: ");
//         for(int num:arr2){
//             System.out.print(num+ " ");
//         }
//     }
// }

// using built-in function

public class CopyOfElements{
    public static int[] copyArray(int[] arr){
        int[] newArr = new int[arr.length];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr1 = {2,5,3,4,6,1,7};
        int[] arr2 = copyArray(arr1);
        System.out.println("New Array: ");
        for(int num:arr2){
            System.out.print(num+" ");
        } 
    }
}
