package java_methods;

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
        obj1.addition();
        obj1.subtraction();
        obj1.multi();
        obj1.division();
    }
}
