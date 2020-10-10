package interviewguide.tree;

public class IsPostArray {
    public boolean isPostArray(int[] arr){
        if(arr == null || arr.length == 0){
            return false;
        }
        return isPost(arr,0,arr.length-1);

    }

    public boolean isPost(int[] arr, int start, int end){
        if(start == end){
            return true;
        }
        int less = -1;
        int more = end;
        for (int i = start; i <end ; i++) {
            if(arr[i] < arr[end]){
                less = i;
            }else {
                if(more == end){
                    more = i;
                }
            }
        }
        if(less > more){
            return false;
        }
        return isPost(arr,start,less) && isPost(arr,more,end-1);

    }
}
