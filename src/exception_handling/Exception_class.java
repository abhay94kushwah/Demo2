package exception_handling;

public class Exception_class {
    public int Divide(int A,int B){
        int result=1;
        try {
            int result1 = A / B;
        }
        catch(Exception e){
            System.out.println("printing :"+e);
        }
        return result;
    }

    public static void main(String[] args) {
        Exception_class obj=new Exception_class();
       int result= obj.Divide(8,0);
        System.out.println("Divide :"+result);
    }
}
