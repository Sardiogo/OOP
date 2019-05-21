import java.time.*;

class Employee
{
    private String name;
    private double salary;
    private LocalDate hireDay;
    /*
     * three instance fields that will hold the data manipulated
     * inside an instance of the Employee class.
     */

    // Constructor
    public Employee(String n, double s, int year, int month, int day)
    {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public LocalDate getHireDay()
    {
        return hireDay;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public boolean equals(Employee other)
    {
        return name.equals(other.name);
        // equals method belongs to java.lang.String class
        // This method returns true if the String are equal; false
        // otherwise
        // java.lang is the default API no 'import' needed
    }

    public static void main(String[] args) // unit test
    {
        Employee e = new Employee("Romeo", 50000, 2003, 3, 31);
        e.raiseSalary(10);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}
