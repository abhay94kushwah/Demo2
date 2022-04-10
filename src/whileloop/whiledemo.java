package whileloop;

public class whiledemo {
    public static void main(String[] args){

       int i=0;
       while (i<10){
           System.out.println("Morning "+i);
           i++;
        }
//do while loop
        do{
            System.out.println("insidedo while loop "+i);
i--;
        } while(i>0);
    }
}
