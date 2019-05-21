
public class EmployeeTest
{
    public static void main(String[] args)
    {
        // fill the staff array with three Employee objects
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Harry Hacker", 40000, 1990, 3, 15);

        if (staff[2].equals(staff[1]))
            System.out.println("true");
        
        // raise everyone's salary by 5%
        for (Employee e : staff)
            // for each e in staff
            e.raiseSalary(5);

        // print out information about all Employee objects
        for (Employee e : staff)
        {
            e.setId();
            System.out.println("name=" + e.getName() + ",id=" + e.getId()
                               + ",salary=" + e.getSalary() + ",hireDay="
                               + e.getHireDay());
        }

        int n = Employee.getNextId(); // calls static method
        System.out.println("Next available id=" + n);
    }
}
