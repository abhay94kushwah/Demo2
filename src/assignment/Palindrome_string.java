package assignment;

import java.util.Scanner;

public class Palindrome_string {
    public static void main(String[] args){
        String a;
        System.out.println("Enter a string");
        Scanner sc=new Scanner(System.in);
        a=sc.nextLine();
        String c=a;
        StringBuffer b=new StringBuffer(a);
        String d= String.valueOf(b.reverse());
        System.out.println(d);


        if(c.equals(d)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }
}
