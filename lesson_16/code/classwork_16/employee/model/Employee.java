package classwork_16.employee.model;

import classwork_16.car_object.model.Car;

import static jdk.internal.org.jline.utils.Colors.s;

public class Employee {

    //field
    private int id;
    private String name;
    private String lastName;
    private double salary;
    private boolean gender;

    //constructor
    public Employee(int id, String name, String lastName, double salary, boolean gender) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
        this.gender = gender;
    }

    //setter
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //getter
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isGender() {
        return gender;
    }

    public String displayEmployee(){
        return String.format("ID: %d, name: %s, lastName %s, salary: %.2f, gender: %s", id, name, lastName, salary, gender);
    }

}
