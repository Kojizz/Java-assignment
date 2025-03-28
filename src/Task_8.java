import java.util.Scanner;

public class Task_8 {
    public static boolean  isdig(String s) {//function to check is digit string
        for (int i = 0; i < s.length(); i++) {//loop goes from 0 to string length
            if (!Character.isDigit(s.charAt(i))) {// here if statement checks is character not a digit and return false
                return false;
            }
        }
        return true;//otherwise true
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//input named sc
        String s = sc.next();//our string for check
        if(isdig(s)==true)//here if statement calls function to compare with true or false result
            System.out.println("Yes");//if its true then output will be Yes
        else
            System.out.println("No");//otherwise No
    }
}