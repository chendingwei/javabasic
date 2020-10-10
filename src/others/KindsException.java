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
//            int m = arr[2];
            System.out.println("catch success");
        }finally {
            System.out.println("finally");
//            int n = arr[2];
            System.out.println("finally success");
        }
        System.out.println("main");
    }

    public int sum(String a,int b ){
        return 1;
    }

    public int sum(int a, String b){
        return 1;
    }
}
