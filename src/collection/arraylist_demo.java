package collection;
import java.util.ArrayList;
import java.util.Arrays;
public class arraylist_demo {
    public static void main(String[] args){

        ArrayList courseList=new ArrayList();

        courseList.add("java");
        courseList.add("python");
        courseList.add("c++");
        courseList.add("c");
        courseList.add("PHP");

        System.out.println(courseList.get(0));
        System.out.println(courseList.get(1));
        System.out.println(courseList.get(2));
        System.out.println(courseList.get(3));
        System.out.println(courseList.get(4));

        for(int i=0;i<courseList.size(); i++){
            System.out.println("printing with loop :"+courseList.get(i));
        }

        for(Object var: courseList){
            System.out.println("Advance for loop :"+var);
        }
        System.out.println("Before using remove :"+courseList.get(2));
        courseList.remove(2);
        System.out.println("After using remove :"+courseList.get(2));

        System.out.println("Before using remove :"+courseList.get(1));
        courseList.remove(1);
        System.out.println("After using remove :"+courseList.get(1));

    }
}
