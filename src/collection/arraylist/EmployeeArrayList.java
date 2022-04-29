package collection.arraylist;
import java.util.ArrayList;
import model.Employee;

public class EmployeeArrayList {
    public ArrayList<Employee> createEmployeeList(){
        ArrayList<Employee> EmployeeArrayList=new ArrayList<>();

        Employee employee1=new Employee("Abhay singh","IT",23);
        Employee employee2=new Employee("Rahul sharma","CS",65);
        Employee employee3=new Employee("Ramesh jadaun","Mechanical",89);

        EmployeeArrayList.add(employee1);
        EmployeeArrayList.add(employee2);
        EmployeeArrayList.add(employee3);
        return EmployeeArrayList;
    }

    public static void main(String[] args){
        EmployeeArrayList object=new EmployeeArrayList();
        ArrayList<Employee> EmployeeArrayList= object.createEmployeeList();

        for(Employee var : EmployeeArrayList){
            System.out.println("printing Employee Department : " +var.getDepatrment()+ " Name : " +var.getName()+" ID: " +var.getID());
        }
        //For Setter
        for(Employee var : EmployeeArrayList){
            var.setDepatrment("CS");
            System.out.println("For setter printing Employee Department : " +var.getDepatrment()+ " Name : " +var.getName()+" ID: " +var.getID());
        }

    }
}
