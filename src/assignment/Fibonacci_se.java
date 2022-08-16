package assignment;

import java.util.Scanner;

public class Fibonacci_se {
    public static void main(String[] args){
        int term,firstterm=0,secondterm=1,nextterm;
        System.out.println("Enter any term");
        Scanner sc=new Scanner(System.in);
        term=sc.nextInt();

        for(int i=1;i<=term;i++){
            System.out.println(firstterm);
            nextterm=firstterm+secondterm;
            firstterm=secondterm;
            secondterm=nextterm;
        }
    }
}
