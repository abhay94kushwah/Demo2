package assignment;

public class Duplicate_character_in_String {
    public static void main(String[] args){
        String A="JAVA CLASS";
        char[] array=A.toCharArray();
        System.out.println("the string is :"+A);
        System.out.println("Duplicate character in string is :");

        for(int i=0; i<A.length(); i++){
            for(int j=i+1; j<A.length(); j++){
                if(array[i]==array[j]){
                    System.out.println(array[i]+"");
                    break;
                }
            }
        }
    }
}
