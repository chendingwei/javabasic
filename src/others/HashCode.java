package others;

public class HashCode {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(1);
        Integer i2 = Integer.valueOf(1);
        Integer i3 = Integer.valueOf(128);

        int h1 = i1.hashCode();
        int h2 = i2.hashCode();
        int h3 = i3.hashCode();
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);

        synchronized (i1){

        }
    }
}
