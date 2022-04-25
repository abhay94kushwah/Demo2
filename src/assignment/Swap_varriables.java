package assignment;
import java.util.Scanner;
public class Swap_varriables {
    public static void main(String[] args){
        System.out.println("please enter the value of a and b");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();//a=20
        int b= sc.nextInt();//b=30
        System.out.println("Before swapping :"+a+ "+b");
        a=a+b;//a=20+30=50
        b=a-b;//b=30-20=10
        a=a-b;//a=30-20=10
        System.out.println("After swapping :"+a+ "+b");

    }
}
