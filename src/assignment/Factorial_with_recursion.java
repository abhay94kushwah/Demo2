package assignment;

import java.util.Scanner;

public class Factorial_with_recursion {
    public static void main(String[] args){
        System.out.println("Enter any no.");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Factorial_with_recursion obj=new Factorial_with_recursion();
        int result= obj.fact(n);
        System.out.println("Factorial of given no. :" +result);
    }
    int fact(int n){
        if(n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}
