package assignment;

import java.util.Scanner;

public class Armstrong_no {
    public static void main(String[] args){
        int n,a,rem,s=0;
        System.out.println("Enter any number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=n;
        while(n>0){
            rem=n%10;
            s=(rem*rem*rem)+s;
            n=n/10;
        }
        if(a==s){
            System.out.println("Armstrong no.");
        }
        else{
            System.out.println("Not an Armstrong no.");
        }
    }
}
