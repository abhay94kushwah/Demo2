package conditional_statement;

public class Demo2 {
    public static void main(String[] args){
        int age=21;

            if(age>18){
            System.out.println("you are elegible for voting");
        }
        else{
            System.out.println("you are not elegible for voting");
        }
        String city="pune";

        if(city=="Delhi") {
            System.out.println("you are in pune");
        }
            else{
                System.out.println("you are not in pune");
            }
            double price=25000.50;
            if(price<260000){
                System.out.println("price is not costly");
            }
            else{
                System.out.println("price is costly");
            }
            if(age>18 & city=="pune"){
                System.out.println("you are elegible for voting in pune");

            }
            else{
                System.out.println("you are not elegible for voting in pune");
            }


    }
}
