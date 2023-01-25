package assignment;

import java.util.HashMap;

public class Countcharacter_from_string_usingHashmap {
    public static void main(String[] args) {
        String s="java is a language";
        int count;
        char ch;
        HashMap<Character,Integer> hashmap=new HashMap<Character,Integer>();
        for (int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if (hashmap.containsKey(ch)){
                count=hashmap.get(ch);
                count++;
                hashmap.replace(ch,count);
            }else{
                hashmap.put(ch,1);
            }
        }
        for (Character key : hashmap.keySet()
             ) {
            System.out.println(key+"="+hashmap.get(key));
            
        }
    }
}
