
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static int[] duplicates(int[] arr){
        Set<Integer> s1 = new HashSet<>();
        for(int num:arr){
            s1.add(num);
        }

        int[] newArr = new int[s1.size()];
        int i=0;
        for(int num:s1){
            newArr[i++]=num;
        }
        return newArr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,5,6,7};
        int[] arr2 = duplicates(arr);
        System.out.println("New Array: ");
        for(int num:arr2){
            System.out.print(num+" ");
        }
    }
}
