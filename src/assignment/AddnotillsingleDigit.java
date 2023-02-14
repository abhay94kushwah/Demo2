package assignment;

public class AddnotillsingleDigit {
    public static void main(String[] args) {
        String s="12345";
        int n=Integer.parseInt(s);
        int r,sum = 0;
        while (n>9){
            sum=0;
            while (n>0){
                r=n%10;
                n=n/10;
                sum=sum+r;
            }
            n=sum;
        }
        System.out.println("print single digit :"+sum);
    }
}
