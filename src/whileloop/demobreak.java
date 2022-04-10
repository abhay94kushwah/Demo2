package whileloop;

public class demobreak {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("demo break " + i);
            if (i == 3) {
                break;
            }
        }
        int j = 10;
        while (j > 0) {
            System.out.println("value of j " +j);
j--;
            if (j == 7){
                break;
            }

        }
        }
    }