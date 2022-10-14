package lab.lab_5.q3;

// Fig. 8.8: Employee.java
// Employee class with references to other objects.

public class Employee {
    private String firstName;
    private String lastName;
    private final Date birthDate;
    private final Date hireDate; 
 
    // constructor to initialize name, birth date and hire date
    public Employee(String firstName, String lastName, Date birthDate, 
       Date hireDate) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.birthDate = birthDate;
       this.hireDate = hireDate;
    } 

    public void setBirthDate(int day, int month, int year)
    {
       Date newBirthDate = new Date(month, day, year);
       birthDate = newBirthDate;
    }
    
    public void setHireDate(int day, int month, int year)
    {
       Date newHireDate = new Date(month, day, year);
       hireDate = newHireDate;
    }


    // convert Employee to String format
    public String toString() {
       return String.format("%s, %s  Hired: %s  Birthday: %s", 
          lastName, firstName, hireDate, birthDate);
    } 
 } 
