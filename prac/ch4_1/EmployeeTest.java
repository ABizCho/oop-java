package prac.ch4_1;

public class EmployeeTest
{

    public static void main(String[] args)
    {
        Employee[] staff = new Employee[3];
        
        staff[0] = new Employee("Cho",400000,2022,1,1);

        staff[1] = new Employee("Lee",350000,2022,2,1);
        
        staff[2] = new Employee("Ahn",32000,2022,5,1);

        // print staff's info
        for (Employee e : staff)
            System.out.println("name: " + e.getName() + ", salary: " + e.getSalary() +", hireDay :"+ e.getHireDay());
            
        // raise staff's salary
        for (Employee e : staff)
            e.raiseSalary(5);

        // print staff's info
        for (Employee e : staff)
            System.out.println("name: " + e.getName() + ", salary: " + e.getSalary() +", hireDay :"+ e.getHireDay());
        

    }
    
}