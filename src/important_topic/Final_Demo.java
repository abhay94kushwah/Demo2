package important_topic;

public final class Final_Demo {
    // we can not override final method.

    public final void m1(){
        System.out.println("printing m1");
    }

    public static void main(String[] args){

       final String city="Agra";
        System.out.println("Before printing city :"+city);
        //city="Tundla";
        System.out.println("After printing city :"+city);
    }
}
