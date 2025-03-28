import java.util.Scanner;

public class Task_10 {
    public static int GDC(int n,int k){
        if(k==0)return n;//case when k==0 gives n
        return GDC(k,n%k);//change with places k and n to have reminder of division between them and goes util k will be 0
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//input named "in"
        int n = in.nextInt();
        int k = in.nextInt();
        System.out.println(GDC(n,k));//output calls function

    }

}