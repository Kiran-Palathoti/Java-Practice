public class Problem1 {
    public static void main(String[] args) {
        String s = null;
        try{
            System.out.println(s.length());
        }
        catch(NullPointerException e){
            System.out.println("NullPointer Exception");
        }
        finally{
            System.out.println("Closing resources");
        }
    }
}
