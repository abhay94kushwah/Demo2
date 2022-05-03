package collection.hashset;
import java.util.HashSet;
import model.Employee;
import model.Employee_model;

public class Employee_Set {
    public HashSet<Employee_model> createEmployeeSet(){
        HashSet<Employee_model> EmployeeSet=new HashSet<>();

        Employee_model employee1=new Employee_model("Abhay singh","IT",23);
        Employee_model employee2=new Employee_model("Rohit sharma","CS",65);
        Employee_model employee3=new Employee_model("Mohit sharma","CS",65);
        Employee_model employee4=new Employee_model("Mohan senger","Mechanical",89);

        EmployeeSet.add(employee1);
        EmployeeSet.add(employee2);
        EmployeeSet.add(employee3);
        EmployeeSet.add(employee4);

        return EmployeeSet;

    }

    public static void main(String[] args){
        Employee_Set obj=new  Employee_Set();
        HashSet<Employee_model> EmployeeSet=obj.createEmployeeSet();
        System.out.println("printing size :"+EmployeeSet.size());

        for(Employee_model var : EmployeeSet ){
            System.out.println("printing Employee HashSet : " +var.getDepatrment()+ " Name : " +var.getName()+" ID: " +var.getID());
        }
    }
}
