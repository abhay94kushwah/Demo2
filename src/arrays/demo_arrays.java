package arrays;

public class demo_arrays {
    public static void main(String[] args) {

        double[] price = {143.45, 879.56, 846.12, 456.32, 987.12};

        System.out.println("array with index "+price[0]);
        System.out.println("array with index "+price[1]);
        System.out.println("array with index "+price[2]);
        System.out.println("array with index "+price[3]);
        System.out.println("array with index "+price[4]);

        for(int j=0;j<price.length;j++){
            System.out.println("Loop: array with for loop "+price[j]);
        }

        for(double beast:price){
            System.out.println("Advance for loop with array "+beast);
        }

    }
}