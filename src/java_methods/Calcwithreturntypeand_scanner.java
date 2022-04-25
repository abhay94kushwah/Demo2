package java_methods;
import java.util.Scanner;
public class Calcwithreturntypeand_scanner {
    public int Addition(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the value of a");
        int a=scanner.nextInt();
        System.out.println("please enter the value of b");
        int b=scanner.nextInt();
        int sum = a+b;
        System.out.println("Addition is :"+sum);
        return a+b;
    }
    public int subtraction(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the value of a");
        int a=scanner.nextInt();
        System.out.println("please enter the value of b");
        int b=scanner.nextInt();
        int sub=a-b;
        System.out.println("Subtraction is :"+sub);
        return a-b;
    }
    public int multi(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the value of a");
        int a=scanner.nextInt();
        System.out.println("please enter the value of b");
        int b=scanner.nextInt();
        int multi=a*b;
        System.out.println("multi is :"+multi);
        return a*b;
    }
    public int divide(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the value of a");
        int a=scanner.nextInt();
        System.out.println("please enter the value of b");
        int b=scanner.nextInt();
        int divide=a/b;
        System.out.println("Division is :"+divide);
        return a/b;
    }
    public static void main(String[] args){
        Calcwithreturntypeand_scanner obj=new Calcwithreturntypeand_scanner();
        Scanner scanner=new Scanner(System.in);
        String flag ="y";
        while(flag.equals("y")){
            System.out.println("Enter your choice 1 for add,2 for sub,3 for multi,4 for divide");
            int choice=scanner.nextInt();
            if(choice==1){
                obj.Addition();
            }
            else if(choice==2){
                obj.subtraction();
            }
            else if(choice==3){
                obj.multi();
            }
            else if(choice==4){
                obj.divide();
            }
            Scanner scanner1=new Scanner(System.in);
            System.out.println("For exit Please enter N ");
            flag = scanner1.nextLine();
        }
    }
}
