package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class String_anagrams {
    public static void main(String[] args){
        String a;
        String b;
        System.out.println("Enter Strings");
        Scanner sc=new Scanner(System.in);
        a=sc.nextLine();
        Scanner sc1=new Scanner(System.in);
        b=sc1.nextLine();

        char c[]=a.toCharArray();
        char d[]=b.toCharArray();

        Arrays.sort(c);
        Arrays.sort(d);

        boolean result=Arrays.equals(c,d);

        if(result==true){
            System.out.println("Strings are an Anagrams");
        }
        else{
            System.out.println("Strings are not an Anagrams");
        }
    }
}
