package assignment;
import java.util.Arrays;
public class Anagrams {
    public static void main(String[] args){
        String A="keep";
        String B="peek";
        A=A.toLowerCase();
        B=B.toLowerCase();

        if(A.length()==B.length()){
            char[] charArray1=A.toCharArray();
            char[] charArray2=B.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            boolean result=Arrays.equals(charArray1,charArray2);

            if(result){
                System.out.println(A + " and " + B + " are an anagram");
            }
            else{
                System.out.println(A +" and " +B +" are not an anagram");
            }

        }else{
            System.out.println(A +" and " +B +" are not an anagram");
        }
    }
}
