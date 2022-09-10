import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Demo_Stream {

    public static void main(String[] args){
        ArrayList<String> emplist=new ArrayList<>();

        emplist.add("Abhay");
        emplist.add("Ramesh");
        emplist.add("Sophie");
        emplist.add("Apurva");

       // emplist.stream().forEach(a-> System.out.println(a));
        Collectors collectors = null;
        emplist.stream().filter(a-> a.length()>5&& a.length()<7).collect(collectors.toList()).forEach(System.out::println);


    }
}
