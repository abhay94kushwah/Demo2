package scanner;
import java.util.Scanner;
public class Scanner_class {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your gender :");
        String A=scanner.nextLine();
        System.out.println("you have entered: "+A);

        System.out.println("please enter your age :");
        int age=scanner.nextInt();
        System.out.println("you have entered :"+age);

        System.out.println("please enter your salary");
        double P=scanner.nextDouble();
        System.out.println("you have entered your salary as :"+P);


    }
}
