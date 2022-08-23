package assignment;

public class Reverse_string {

    public static void main(String[] args){

        String A="Abhay";
        char[] B=A.toCharArray();
                           // converts the given string into a sequence of characters
        for(int i=B.length-1;i>=0;i--){

            System.out.println("Reverse string :" +B[i]);
        }

        String C="DONKEY";
        String D="";

        for(int i=C.length()-1;i>=0;i--){

            // returns the character at the specified index in a string
            D=D+C.charAt(i);

            System.out.println("Reversed string :"+D);
        }
    }
}
