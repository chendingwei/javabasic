package interviewguide.queue.test;

import interviewguide.queue.GetMaxWindow;

public class GetMaxWindowTest {
    public static void main(String[] args) {
        int[] arr = {4,3,5,4,3,3,6,7};
        int windows = 3;
        GetMaxWindow getMaxWindow = new GetMaxWindow(arr,windows);

//        int[] maxWindow = getMaxWindow.getMaxWindow();
        int[] maxWindow = getMaxWindow.getMaxWindow(arr, windows);
        for (int i : maxWindow) {
            System.out.println(i);
        }
    }
}
