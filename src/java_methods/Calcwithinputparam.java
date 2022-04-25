package java_methods;

public class Calcwithinputparam {
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int multi(int a,int b){
        return a*b;
    }
    public int divide(int a,int b){
        return a/b;
    }

    public static void main(String[] args){

        Calcwithinputparam obj=new Calcwithinputparam();
        int result=obj.add(4,3);
        System.out.println("addition is :"+result);
        int result1=obj.sub(9,4);
        System.out.println("sub is :"+result1);
        int result2=obj.multi(5,6);
        System.out.println("multi is :"+result2);
        int result3=obj.divide(8,2);
        System.out.println("divide is :"+result3);
    }

    }

