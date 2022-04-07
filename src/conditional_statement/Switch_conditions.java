package conditional_statement;

public class Switch_conditions {
    public static void main(String[] args){

        int Day=6;
        switch(Day){

            case 1:
                System.out.println("day is monday");
                break;
            case 2:
                System.out.println("day is tuesday");
                break;
            case 3:
                System.out.println("day is wednesday");
                break;
            case 4:
                System.out.println("day is thursday");
                break;
            case 5:
                System.out.println("day is friday");
                break;
            case 6:
                System.out.println("day is saturday");
                break;
            case 7:
                System.out.println("day is sunday");
                break;
            default:
                System.out.println("you have entered invalid number...");

        }
    }
}
