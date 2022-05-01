package collection.hashset;
import java.util.HashSet;
public class Mobile_brand_hashset {
    public HashSet<String>  createmobilebrand(){
        HashSet<String> mobilebrand=new HashSet<>();

        mobilebrand.add("Apple");
        mobilebrand.add("Samsung");
        mobilebrand.add("Oppo");
        mobilebrand.add("Redmi");
        mobilebrand.add("Apple");
        mobilebrand.add("Samsung");
        mobilebrand.add("Oppo");
        mobilebrand.add("Redmi");

        return mobilebrand;
    }
    public HashSet<Double> createprice(){
        HashSet<Double> price=new HashSet<>();

        price.add(8000.12);
        price.add(40000.23);
        price.add(65000.56);
        price.add(12000.89);
        price.add(8000.12);
        price.add(40000.23);
        price.add(65000.56);
        price.add(12000.89);

        return price;
    }
    public HashSet<Integer> createram(){
        HashSet<Integer> ram=new HashSet<>();

        ram.add(4);
        ram.add(6);
        ram.add(8);
        ram.add(12);
        ram.add(2);
        ram.add(8);
        ram.add(12);

        return ram;

    }

    public static void main(String[] args){

        Mobile_brand_hashset obj=new Mobile_brand_hashset();
        HashSet<String> mobilebrand= obj.createmobilebrand();
        for(String var : mobilebrand){
            System.out.println("printing mobilebrand :"+var);
        }
        HashSet<Double> price=obj.createprice();
        for(Double var : price){
            System.out.println("printing price :"+var);
        }
        HashSet<Integer> ram=obj.createram();
        for(Integer var : ram){
            System.out.println("printing ram :"+var);
        }
        System.out.println("printing Size :"+mobilebrand.size()+" :"+price.size()+" :"+ram.size());



    }
}
