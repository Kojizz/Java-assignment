import java.util.Scanner;

//Prime number divides only for 1 and by themself and cant be 1
//Composite number divides for 2 and more than 2 numbers
public class Task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//input named "sc"
        int n = sc.nextInt(); //user print number
        if(n%2==1 || n==2) System.out.println("Prime"); //if n divided by 2 rest 1 or n=2 then its prime
        else System.out.println("Composite");//otherwise its Composite
    }
}
