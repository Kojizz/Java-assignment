import java.util.Scanner;

public class Task_6  {
    public static long cal(int a,int n){ //function to calculate a^n
        return(long) Math.pow(a,n);//here Math.pow calculate a power of n,(long)convert result double to long type
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//input named "in"
        int a = in.nextInt();
        int n = in.nextInt();
        System.out.println(cal(a,n));//output
    }
}