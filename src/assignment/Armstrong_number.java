package assignment;
public class Armstrong_number {
    public static void main(String[] args){
        int num=153,number,a,total =0;//a number whose qube of every no.'s sum is the same no.ex 1+(5*5*5)+(3*3*3)=153
        number=num;
        while(number!=0){
            a= number%10;
            total=total+a*a*a;
            number/=10;
        }
        if(total==num){
            System.out.println(num+ " is an armstrong number");
        }
        else{
            System.out.println(num+ " is not an armstrong number");
        }
    }

}
