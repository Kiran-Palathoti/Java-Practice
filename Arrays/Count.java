

public class Count {
    public static void countOfElements(int[] arr){
        int evenCount = 0;
        int oddCount = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println("Even count: "+evenCount);
        System.out.println("Odd count: "+oddCount);
    }

    public static void main(String[] args) {
        int[] arr = {2,4,1,5,8,7,9};
        countOfElements(arr);
    }
}
