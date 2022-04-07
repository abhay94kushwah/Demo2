package conditional_statement;

public class Not_operator {
    public static void main(String[] args){
        int age=21;
        if( !(age>18) ){
            System.out.println("you are elegible for voting");
        }
        else{
            System.out.println("you are not elegible for voting");
        }
    }
}
