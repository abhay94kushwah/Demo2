package java_methods;
import java.util.Scanner;
public class Calculator {
    public void addition(){
        int a=5;
        int b=7;
        int sum=a+b;

        System.out.println("addition is :"+sum);
    }
    public void subtraction(){
        int a=10;
        int b=5;
        int sub=a-b;

        System.out.println("subtraction is :"+sub);
    }
    public void multi(){
        int a=5;
        int b=4;
        int multi=a*b;

        System.out.println("multi is :"+multi);
    }
    public void division(){
        int a=25;
        int b=5;
        int divide=a/b;

        System.out.println("Division is :"+divide);
    }
    public static void main(String[] args){


        Calculator obj1=new Calculator();

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your choice : 1 for add,2 for sub,3 for multi,4 for division");
        int choice= scanner.nextInt();
        if(choice==1){
            obj1.addition();
        }
        else if(choice==2){
            obj1.subtraction();
        }
        else if(choice==3){
            obj1.multi();
        }
        else if(choice==4){
            obj1.division();
        }
    }
}
