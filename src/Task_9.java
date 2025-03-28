import java.util.Scanner;

//Binomial Coefficient of n and k formula is n!/k!(n-k)!
public class Task_9 {
    public static int factorial_of_number(int n){ //function to find number factorial
        int res =1;
        for(int i=1;i<=n;i++){// check range from 1 to n;
            res*=i;//and multiply res with "i" starting from 1
        }
        return res;//return result
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//input named "in"
        int n = in.nextInt();//first coefficient
        int k = in.nextInt();//second coefficient
        int n2 = factorial_of_number(n); //new value that get result of first coefficient factorial
        int k2 = factorial_of_number(k);// new value that get result of second coefficient factorial
        int p = factorial_of_number(n-k);//new value that get factorial of reduction between two coefficients
        System.out.println(n2/(k2*p));//output of short written formula

    }
}