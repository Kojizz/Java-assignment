import java.util.ArrayList;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//Creat new input named "in"
        int n = in.nextInt(); //print n value for list range
        ArrayList<Integer> arr = new ArrayList<>();//Creat new list

        for(int i = 1; i <= n; i++) { //by n range user adds list integers
            arr.add(in.nextInt());
        }
        int min = arr.get(0);//first set for finding minimum in for loop
        for(int i = 1; i < n; i++) {
            if(arr.get(i) <= min) { //its checks every integer in list to find minimum
                min = arr.get(i); //if it passed then new min
            }
        }
        System.out.println(min); //output min
    }
}