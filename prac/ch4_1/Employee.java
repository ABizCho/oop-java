package prac.ch4_1;

import java.time.LocalDate;

class Employee {
    // Fields
    private String name;
    private double salary;
    private LocalDate hireDay;

    // Constructors
    public Employee(String n, double s, int year, int month, int day)
    {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    // public Methods (3 accessors and 1 mutator)
    public String getName() //read only
    {
        return name;
    }
    public double getSalary(){ // r.o
        return salary;
    }
    public LocalDate getHireDay(){ // r.o
        return hireDay;
    }
    public void raiseSalary(double byPercent){ //update(mutator)
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
