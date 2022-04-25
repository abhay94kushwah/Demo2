package assignment;
import java.util.HashSet;
import java.util.Set;
public class Duplicate_array {
    public static void main(String[] args){
        String arr[] = {"Rome","London","Berlin","Rome","Delhi","London","Berlin"};
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.println("duplicate element :"+arr[i]);
                }
            }
        }
        int[] arr1 = {2,5,5,7,4,6,8,7,4};
        for(int i=0; i<arr1.length; i++){
            for(int j=i+1; j<arr1.length; j++){
                if(arr1[i]==arr1[j]){
                    System.out.println("Duplicate array is :"+arr1[i]);
                }
            }
        }
        String arr2[] = {"Rome","London","Berlin","Rome","Delhi","London","Berlin","Delhi"};
        Set<String> data= new HashSet<String>();
        for(String e : arr2){
            if(data.add(e)){
                System.out.println(e);
            }

        }
    }
}
