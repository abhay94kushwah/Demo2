package class_and_object;

public class Employee {
    String name;
    String compony;
    int hour;
    double salary;

    public Employee(String name, String compony, int hour, double salary) {
        this.name = name;
        this.compony = compony;
        this.hour = hour;
        this.salary = salary;
    }

    public static void main(String[] args){

        Employee obj1=new Employee("Abhay singh","Wipro",8,56000.299);
        Employee obj2=new Employee("Rahul chauhan","IBM",8,66000.456);
        Employee obj3=new Employee("Banti","Google",8,57000.799);

        System.out.println("printing name "+obj1.name);
        System.out.println("printing compony "+obj1.compony);
        System.out.println("printing hour "+obj1.hour);
        System.out.println("printing salary "+obj1.salary);

        System.out.println("printing name "+obj2.name);
        System.out.println("printing compony "+obj2.compony);
        System.out.println("printing hour "+obj2.hour);
        System.out.println("printing salary "+obj2.salary);

        System.out.println("printing name "+obj3.name);
        System.out.println("printing compony "+obj3.compony);
        System.out.println("printing hour "+obj3.hour);
        System.out.println("printing salary "+obj3.salary);

    }
}
