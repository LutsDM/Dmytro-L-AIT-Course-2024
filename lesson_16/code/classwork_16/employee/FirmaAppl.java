package classwork_16.employee;

import classwork_16.employee.model.Employee;

public class FirmaAppl {

    public static void main(String[] args) {

        Employee e1 = new Employee(1,"Dmytro", "Luts", 3000, true);
        Employee e2 = new Employee(2,"Sergey", "Timchenko", 1000, true);
        Employee e3 = new Employee(3,"Mykolay", "Topolya", 2500, true);
        Employee e4 = new Employee(4,"Anna", "Holota", 1200, false);
        Employee e5 = new Employee(5,"Helga", "Koloda", 5000, false);

        System.out.println(e1.displayEmployee());
        System.out.println(e2.displayEmployee());
        System.out.println(e3.displayEmployee());
        System.out.println(e4.displayEmployee());
        System.out.println(e5.displayEmployee());

        double totalSalary = e1.getSalary() + e2.getSalary() + e3.getSalary() + e4.getSalary() + e5.getSalary();
        System.out.println("Total salary = " + totalSalary);

        Employee[] employees = new Employee[5];
        employees[0] = e1;
        employees[1] = e2;
        employees[2] = e3;
        employees[3] = e4;
        employees[4] = e5;

        totalSalary = 0;

        for (int i = 0; i < employees.length; i++) {
            totalSalary += employees[i].getSalary();
        }

        System.out.println("Check: " + totalSalary);
    }
}
