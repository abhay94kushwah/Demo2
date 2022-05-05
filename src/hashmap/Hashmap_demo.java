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

        for(String var : map.keySet()){
            System.out.println("printing with keyset :"+map.get(var));
        }

        HashMap<Integer,String> map1=new HashMap<>();

        map1.put(31,"maths");
        map1.put(56,"English");
        map1.put(74,"Chemistry");
        map1.put(54,"Hindi");

        System.out.println("printing key goal :"+map1.get(31));
        System.out.println("printing key goal :"+map1.get(56));
        System.out.println("printing key goal :"+map1.get(74));
        System.out.println("printing key goal :"+map1.get(54));

        for(Integer var : map1.keySet()){
            System.out.println("print with keyset :"+map1.get(var));
        }
    }
}
