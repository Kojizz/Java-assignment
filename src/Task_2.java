import java.util.ArrayList;
import java.util.Scanner;

//to find average of elements we need to sum all of them then divide to amount of elements
public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //input named "in"
        int n = in.nextInt(); //user print range of n in the list
        ArrayList<Integer> list = new ArrayList<Integer>();//Creats new list named "list"
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt()); //user prints elements in the list
        }
        double sum = 0; //new double value to result sum of elements starts from 0
        for (int i = 0; i < n; i++) {
            sum += list.get(i); //plus each element to sum value
        }
        sum = sum / n; //divides sum of elements to the amount
        System.out.println(sum);//output result
    }
}