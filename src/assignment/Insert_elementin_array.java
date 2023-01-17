package assignment;

public class Insert_elementin_array {
    public static void main(String[] args) {
        int[] a={1,2,3,5,6};
        int pos=4;
        int b=4;
        for (int i=a.length-1;i>pos-1;i--){
            a[i]=a[i-1];
        }
        a[pos-1]=b;
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
