package model;

import java.util.Objects;

public class Employee_model {
    String name;
    String depatrment;
    int ID;

    public Employee_model(String name, String depatrment, int ID) {
        this.name = name;
        this.depatrment = depatrment;
        this.ID = ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee_model that = (Employee_model) o;
        return ID == that.ID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
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
