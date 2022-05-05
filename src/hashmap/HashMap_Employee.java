package hashmap;
import model.Employee;
import java.util.HashMap;
public class HashMap_Employee {
    public static void main(String[] args){
        HashMap<Integer, Employee> EmployeeHashMap=new HashMap<>();

        Employee employee1=new Employee("Abhay singh","IT",23);
        Employee employee2=new Employee("Shubham kush","CS",65);
        Employee employee3=new Employee("Rohit Sharma","Mechanical",89);

        EmployeeHashMap.put(1,employee1);
        EmployeeHashMap.put(2,employee2);
        EmployeeHashMap.put(3,employee3);
        for(Integer var : EmployeeHashMap.keySet()){
            System.out.println("printing Employee by Hashmap :"+EmployeeHashMap.get(var).getID()+": "+ EmployeeHashMap.get(var).getName());
        }


    }
}
