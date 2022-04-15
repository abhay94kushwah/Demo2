package java_methods;

public class Students {
    String read;
    String play;
    String eat;
    int sleep;

    public void readingMethods(){

        System.out.println("this is the reading methods ");
    }
    public void playingMethods(){

        System.out.println("this is the playing methods ");
    }
    public void eatingMethods(){

        System.out.println("this is the eating methods ");
    }
    public void sleepingMethods(){

        System.out.println("this is the sleeping methods ");
    }
public static void main(String[] args){
        Students student=new Students();
        student.readingMethods();
        student.playingMethods();
        student.eatingMethods();
        student.sleepingMethods();



}

}
