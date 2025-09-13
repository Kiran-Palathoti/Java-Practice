// 1
// 01
// 101
// 0101
// 10101

public class p9 {
    static void pattern(int n){
        for(int i=0;i<n;i++){
            int start = (i%2==0) ? 1:0;
            for(int j=0;j<=i;j++){
                System.out.print(start);
                start = 1-start;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        pattern(n);
    }
}
