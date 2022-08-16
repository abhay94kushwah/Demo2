package assignment;

import java.util.Scanner;

public class Pelindrome_no {
    public static void main(String[] args) {
        int n,a,rem,s=0;
        System.out.println("Enter any no.");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=n;

        while(n>0){
            rem=n%10;
            s=(s*10)+rem;
            n=n/10;
        }
        if(a==s){
            System.out.println("palindrome no");
        }
        else{
            System.out.println("Not a palindrome no.");
        }

    }
}

