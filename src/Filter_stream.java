import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_stream {


        public static void main(String[] args) {

            List<String> names = Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");
           // List<String> longnames= names.stream()

           names.stream().filter(a-> a.length()>4&& a.length()<8).forEach(a-> System.out.println(a));


        }

    }

