package assignment;
import java.util.Scanner;
public class Palindrome_number {
    public static void main(String[] args){
        System.out.println("Enter a no. to check whether it is palindrome or not");
        Scanner sc=new Scanner(System.in);// a number that is same after reverse ex 121,3223,etc
        int a=sc.nextInt();
        int ram=a;
        int temp=0;

        while(a>0){
            int rem=a%10;
            temp=(temp*10)+rem;
            a=a/10;
        }
        if(ram==temp){
            System.out.println("it is a palindrome no. ");
        }
        else{
            System.out.println("it is not palindrome no. ");
        }
    }

}
