package class_and_object;

public class Parameterized_constructor {
    String name;
    String writername;
    int pages;
    double price;

    public Parameterized_constructor(String name, String writername, int pages, double price) {
        this.name = name;
        this.writername = writername;
        this.pages = pages;
        this.price = price;
    }

    public static void main(String[] args){

        Parameterized_constructor obj1=new Parameterized_constructor("The wuthering heights","Emily Bronte",245,312.45);
        Parameterized_constructor obj2=new Parameterized_constructor("The Independence of 1857","V.D.Sawarkar",547,676.34);

        System.out.println("printing name "+obj1.name);
        System.out.println("printing writername "+obj1.writername);
        System.out.println("printing pages "+obj1.pages);
        System.out.println("printing price "+obj1.price);

        System.out.println("printing name "+obj2.name);
        System.out.println("printing writername "+obj2.writername);
        System.out.println("printing pages "+obj2.pages);
        System.out.println("printing price "+obj2.price);


    }
}
