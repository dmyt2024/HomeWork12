package app.HW12;

public class Employee {

    private String name;
    private String profession;
    private String email;
    private long phone;
    private int age;


    public Employee(String name, String profession, String email, long phone, int age) {
        this.name = name;
        this.profession = profession;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", profession='" + profession + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", age=" + age +
                '}';
    }
}
