package class_and_object;

public class Mobile {
    String Brand="Samsung";
    String colour="Navy blue";
    int battery=6000;
    Double price=22000.50;

    public static void main(String[] args){

        Mobile phone=new Mobile() ;

        System.out.println(phone.Brand);
        System.out.println(phone.colour);
        System.out.println(phone.battery);
        System.out.println(phone.price);


    }

}
