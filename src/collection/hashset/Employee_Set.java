package collection.hashset;
import java.util.HashSet;
import model.Employee;

public class Employee_Set {
    public HashSet<Employee> createEmployeeSet(){
        HashSet<Employee> EmployeeSet=new HashSet<>();

        Employee employee1=new Employee("Abhay singh","IT",23);
        Employee employee2=new Employee("Rohit sharma","CS",65);
        Employee employee3=new Employee("Rohit sharma","CS",65);
        Employee employee4=new Employee("Mohan senger","Mechanical",89);

        EmployeeSet.add(employee1);
        EmployeeSet.add(employee2);
        EmployeeSet.add(employee3);
        EmployeeSet.add(employee4);

        return EmployeeSet;

    }

    public static void main(String[] args){
        Employee_Set obj=new  Employee_Set();
        HashSet<Employee> EmployeeSet=obj.createEmployeeSet();
        System.out.println("printing size :"+EmployeeSet.size());

        for(Employee var : EmployeeSet ){
            System.out.println("printing Employee HashSet : " +var.getDepatrment()+ " Name : " +var.getName()+" ID: " +var.getID());
        }
    }
}
