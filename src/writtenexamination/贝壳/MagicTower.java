package writtenexamination.贝壳;


import java.util.ArrayList;
import java.util.Scanner;

public class MagicTower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> leftList = new ArrayList<>();
        ArrayList<Integer> rightList = new ArrayList<>();
        ArrayList<Integer> leftRecov = new ArrayList<>();
        ArrayList<Integer> rightRecov = new ArrayList<>();
        int life = 1;
        for (int i = 0; i <n ; i++) {
            leftList.add(0,sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            rightList.add(sc.nextInt());
        }

        for (int i = 0; i < n; i++) {
            leftRecov.add(0,sc.nextInt());
        }

        for (int i = 0; i < n; i++) {
            rightRecov.add(sc.nextInt());
        }

        while (!leftList.isEmpty() && !rightList.isEmpty()){
            int leftCost = leftList.get(0) - leftRecov.get(0);
            int rightCost = rightList.get(0) - rightRecov.get(0);
            if(leftCost > rightCost){
                life += leftCost;
                leftList.remove(0);
                leftRecov.remove(0);
            }else {
                life += rightCost;
                rightList.remove(0);
                rightRecov.remove(0);
            }
        }
        while (!leftList.isEmpty()){
            life += leftList.remove(0) - leftRecov.remove(0);
        }
        while (!rightList.isEmpty()){
            life += rightList.remove(0) - rightRecov.remove(0);
        }

        System.out.println(life);
    }
}
