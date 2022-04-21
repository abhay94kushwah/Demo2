package java_methods;

public class Calculator_withreturntype {
    public int addition(){
       int a=54;
       int b=35;

       int sum=a+b;

       return sum;
    }

    public int subtraction(){
        int a=55;
        int b=34;

        int sub=a-b;

        return sub;
    }

    public int multi(){
        int a=23;
        int b=12;

        int multi=a*b;
         return multi;
    }

    public int divide(){
        int a=78;
        int b=13;

        int division=a/b;
        return division;
    }

    public static void main(String[] args){

        Calculator_withreturntype obj1=new Calculator_withreturntype();
        int result=obj1.addition();
        System.out.println("addition is :"+result);

        int result1= obj1.subtraction();
        System.out.println("sub is :"+result1);

        int result2= obj1.multi();
        System.out.println("multi is :"+result2);

        int result3= obj1.divide();
        System.out.println("divide is :"+result3);
    }
}
