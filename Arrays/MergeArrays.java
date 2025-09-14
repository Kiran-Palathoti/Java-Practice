public class MergeArrays {
    public static int[] arrayMerge(int[] arr1,int[] arr2){
        int[] newArr = new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            newArr[i] = arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            newArr[arr1.length+i] = arr2[i];
        }
        return newArr;
    } 

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,0};
        int[] arr3 = arrayMerge(arr1, arr2);
        System.out.println("New array: ");
        for(int num:arr3){
            System.out.print(num+" ");
        }
    }
}
