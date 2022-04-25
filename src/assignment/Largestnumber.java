package assignment;
import java.util.Arrays;
public class Largestnumber {
    public static void main(String[] args){
        int temp,size;
        int array[]={23,56,87,98,45,67};
        size=array.length;
        Arrays.sort(array);
        System.out.println("sorted array :"+Arrays.toString(array));
        int res=array[size-2];
        System.out.println("second largest no. :"+res);

        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                if(array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println("Second largest number :"+array[size-2]);
    }
}
