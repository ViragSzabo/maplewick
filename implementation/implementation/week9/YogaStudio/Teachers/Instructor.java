package implementation.week9.YogaStudio.Teachers;

import implementation.week9.YogaStudio.Enums.Specialization;
import implementation.week9.YogaStudio.Interfaces.*;
import implementation.week9.YogaStudio.Classes.YogaClass;

public abstract class Instructor implements Payable, Description {protected String firstName;
    protected String lastName;
    protected Specialization specialization;
    protected double salary;

    public Instructor(String firstName, String lastName, Specialization specialization) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialization = specialization;
        this.salary = 0.0;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void makePayment(double amount) {
        this.salary += amount;
    }

    @Override
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public abstract void teach(YogaClass yogaClass);
}