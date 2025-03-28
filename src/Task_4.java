import java.util.ArrayList;
import java.util.Scanner;

//n! is multiplication of numbers before n and himself
public class Task_4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //input named "sc"
        int n = sc.nextInt();//user print number
        int m = 1; // starting point for checking numbers before n
        ArrayList<Integer> list = new ArrayList<>();//create list to add numbers before n further
        while (m < n) { //while m less than n it will add numbers starting from 1
            list.add(m);
            m++; // next loop step
        }
        int res = 1; //value for multiplication result
        for (int i = 0; i < list.size(); i++) {
            res *= list.get(i); //multiplication each element with res
        }
        res *=n; // multiplication with n
        System.out.println(res);//output
    }
}