package java_methods;

public class method_input_param {
    public String Guest(String name){
        return name;
    }
    public String place(String address ){
        return address;
    }
    public int makeqube(int number){
        return number*number*number;
    }
    public static void main(String[] args){
        method_input_param obj=new method_input_param();
        String result=obj.Guest("Abhay singh");
        System.out.println("welcome to the party :"+result);

        String result1=obj.place("Bhawana tower");
        System.out.println("In front of Gurudwara :"+result1);

        int result2= obj.makeqube(8);
        System.out.println("qube is :"+result2);

    }
}
