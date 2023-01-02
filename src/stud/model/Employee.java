package stud.model;

public class Employee {
    private String subject;
    private String name;
    private String place;
    private int i;

    @Override
    public String toString() {
        return "Model{" +
                "subject='" + subject + '\'' +
                ", name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", i=" + i +
                '}';
    }

    public Employee(String subject, String name, String place, int i) {
        this.subject = subject;
        this.name = name;
        this.place = place;
        this.i = i;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
