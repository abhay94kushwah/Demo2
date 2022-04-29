package model;

public class Employee {
    String name;
    String depatrment;
    int ID;

    public Employee(String name, String depatrment, int ID) {
        this.name = name;
        this.depatrment = depatrment;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepatrment() {
        return depatrment;
    }

    public void setDepatrment(String depatrment) {
        this.depatrment = depatrment;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
