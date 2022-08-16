package assignment;

import java.util.Arrays;

public class String_anagrams {
    public static void main(String[] args){
        String a="listen";
        String b="silent";

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
