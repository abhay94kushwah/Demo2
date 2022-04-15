package class_and_object;

public class Doctors {
    String name;
    String hospital;
    int staffmember;
    double annualturnover;

    public Doctors(String name, String hospital, int staffmember, double annualturnover) {
        this.name = name;
        this.hospital = hospital;
        this.staffmember = staffmember;
        this.annualturnover = annualturnover;
    }
    public static void main(String[] args){

        Doctors obj1=new Doctors("Dr.Abhilash gupta","Vidhya bansal nursing home",50,5000000.45);
        Doctors obj2=new Doctors("Dr.Rajesh shikhar","priya nursing home",67,7500000.34);
        Doctors obj3=new Doctors("Dr.N.N.Singh","pushanjali hospital",250,15000000.56);

        System.out.println("printing name: "+obj1.name);
        System.out.println("printing hospital name: "+obj1.hospital);
        System.out.println("printing staffmember: "+obj1.staffmember);
        System.out.println("printing turnover: "+obj1.annualturnover);

        System.out.println("printing name: "+obj2.name);
        System.out.println("printing hospital name: "+obj2.hospital);
        System.out.println("printing staffmember: "+obj2.staffmember);
        System.out.println("printing turnover: "+obj2.annualturnover);

        System.out.println("printing name: "+obj3.name);
        System.out.println("printing hospital name: "+obj3.hospital);
        System.out.println("printing staffmember: "+obj3.staffmember);
        System.out.println("printing turnover: "+obj3.annualturnover);

    }
}
