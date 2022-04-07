package conditional_statement;

public class day7 {
    public static void main(String[] args){
        int age=21;
        String city="Agra";
        //TRUE & TRUE
        if(age>18 & city=="Agra"){
            System.out.println("you are elegible for voting in Agra");
        }
        else{
            System.out.println("you are not elegible for voting in Agra");
        }
        //TRUE & FALSE
        city="Delhi";
        if(age>18 & city=="Agra"){
            System.out.println("you are elegible for voting in Agra");
        }
        else{
            System.out.println("you are not elegible for voting in Agra");
        }
        //FALSE & TRUE
        age=17;
        city="Agra";
        if(age>18 & city=="Agra"){
            System.out.println("you are elegible for voting in Agra");
        }
        else{
            System.out.println("you are not elegible for voting in Agra");
        }
        //FALSE & FALSE
        age=16;
        city="pune";
        if(age>18 & city=="Agra"){
            System.out.println("you are elegible for voting in Agra");
        }
        else{
            System.out.println("you are not elegible for voting in Agra");
        }
    }

}
