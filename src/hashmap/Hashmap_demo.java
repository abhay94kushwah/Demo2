package hashmap;
import java.util.HashMap;
public class Hashmap_demo {
    public static void main(String[] args){

        HashMap<String,Integer> map=new HashMap<>();

        map.put("A",45);
        map.put("B",87);
        map.put("C",56);

        System.out.println("printing key :"+map.get("A"));
        System.out.println("printing key :"+map.get("C"));
        System.out.println("printing key :"+map.get("B"));
    }
}
