package important_topic;
// in static method we can not create object that'swhy we can not use non static method inside the Static method
public class Static_class {
    public static String name="Agra"; //Static data
    public String name1; //non Static data
    //we can not use Non static data in Static program.because non static method needs object.

    public static void m1(){
        System.out.println("static method m1 ");
    }

    public static void main(String[] args) {
        //Syntax :calssname.methodname.
        Static_class.m1();
        System.out.println("printing Static :"+Static_class.name);
    }
}
