package others;

import java.util.Iterator;

public class ForEach implements Iterable {
    public int col;
    public int[] arr;

    public ForEach(int[] arr) {
        this.arr = arr;
        this.col = arr.length;
    }

    @Override
    public Iterator iterator() {
        return new MyIterator();
    }

    public class MyIterator implements Iterator{
        private int N;
        public MyIterator() {
            this.N=0;
        }

        @Override
        public boolean hasNext() {
            return N<col;
        }

        @Override
        public Object next() {
            return arr[N++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ForEach forEach = new ForEach(arr);
        for (Object each : forEach) {
            System.out.println(each);
        }
    }
}
