package assignment;

public class Fibonacci_series {
    public static void main(String[] args){
        int i=1,n=5,firstterm=0,secondterm=1;
        System.out.println("Fibonacci series til "+n+ "terms");

        while(i<=n){
            System.out.println(firstterm +",");
            int nextterm=firstterm+secondterm;
            firstterm=secondterm;
            secondterm=nextterm;
            i++;
        }
    }
}
