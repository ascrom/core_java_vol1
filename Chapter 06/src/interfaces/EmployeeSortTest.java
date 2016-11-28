package interfaces;

import java.util.Arrays;

/**
 * This program demonstrates the use of the Comparable interface.
 */
public class EmployeeSortTest {

    public static void main(String[] args) {

        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Harry Hacker", 35_000);
        staff[1] = new Employee("Carl Cracker", 75_000);
        staff[2] = new Employee("Tony Tester", 38_000);

        Arrays.sort(staff);

        for (Employee employee : staff)
            System.out.println("name=" + employee.getName() + ",salary=" + employee.getSalary());
    }
}
