package others;

public class KindsException {
    public static void main(String[] args) {
        int[] arr = {0,1};
        try{
            System.out.println("try");
            int i = arr[2];
            System.out.println("try success");
        }catch (Exception e){
            System.out.println("catch");
            e.printStackTrace();
            int m = arr[2];
            System.out.println("catch success");
        }finally {
            System.out.println("finally");
            int n = arr[2];
            System.out.println("finally success");
        }
        System.out.println("main");
    }
}
