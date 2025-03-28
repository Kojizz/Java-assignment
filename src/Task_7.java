import java.util.ArrayList;
import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//input named sc
        int n = sc.nextInt();//range of list
        ArrayList<Integer> list = new ArrayList<>();//new list
        for (int i = 0; i < n; i++) {//user add elements in list
            list.add(sc.nextInt());
        }
        for (int i = 0; i<n/2; ++i){//in this loop goes from start to middle of list and at the same time from end to middle
            int arr = list.get(i);//new value to keep elements from start to the end
            list.set(i,list.get(n-i-1));//here i is index of reverse list,n-i-1 gives elements from the end to middle and sets
            list.set(n-i-1,arr);//n-i-1 gives index from the end and set elements from arr where keeps elements from start to middle
        };
        System.out.println(list);//output reversed list
    }
}