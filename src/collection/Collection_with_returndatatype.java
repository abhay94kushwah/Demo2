package collection;

import java.util.ArrayList;

public class Collection_with_returndatatype {
    public ArrayList<String> createmobileList(){
        //Collection <DatType> VarName= New Collection<>();
        ArrayList <String> mobileList=new ArrayList<>();
        mobileList.add("Samsung");
        mobileList.add("Realme");
        mobileList.add("Iphone");
        mobileList.add("one plus");
        mobileList.add("Redmi");

        return mobileList;
        }
        public ArrayList<Integer> createdistanceList(){
            ArrayList<Integer> distanceList=new ArrayList<>();
            distanceList.add(45);
            distanceList.add(78);
            distanceList.add(98);
            distanceList.add(65);

            return distanceList;

        }
        public ArrayList<Double> createsalaryList(){
        ArrayList<Double> salaryList=new ArrayList<>();
        salaryList.add(12548.23);
        salaryList.add(45845.44);
        salaryList.add(78946.15);
        salaryList.add(32897.125);

        return salaryList;
        }


    public static void main(String[] args){
        //create object
        Collection_with_returndatatype obj=new Collection_with_returndatatype();
        //obj.methodname

        ArrayList <String> resultList = obj.createmobileList();
        for(String var : resultList){
            System.out.println("printing brand name :"+var);
        }
        ArrayList<Integer> resultList1=obj.createdistanceList();
        for(Integer var : resultList1){
            System.out.println("printing distance :"+var);
        }
        ArrayList<Double> resultList2=obj.createsalaryList();
        for(Double var : resultList2){
            System.out.println("printing salary :"+var);
        }

    }
    }



