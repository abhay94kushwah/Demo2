package assignment;
import java.util.Scanner;
public class Factorial_with_whileloop {
    public static void main(String[] args){
        System.out.println("enter the no.for its factorial :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;

        for(int i=n;i>0;i--){
            fact=fact*i;
            System.out.println("factorial is :"+fact);
        }
        int num=10,i=1;
        int factorial=1;
        while(i<=num){
            factorial=factorial*i;
            i++;
            System.out.println("Factorial of 10 is :"+factorial);
        }
    }
}
