package ait.employee.test;

import ait.employee.dao.Company;
import ait.employee.dao.CompanyImpl;
import ait.employee.model.Employee;
import ait.employee.model.Manager;
import ait.employee.model.SalesManager;
import ait.employee.model.Worker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CompanyImplTest {

    Company company;
    Employee[] emp;

    @BeforeEach
    void setUp() {

        company = new CompanyImpl(5);
        emp = new Employee[4];
        emp[0] = new Manager(1,"N1","L1",160,5000, 25);
        emp[1] = new SalesManager(2,"N1","L1",160,50000, 0.1);
        emp[2] = new SalesManager(3,"N3","L3",160,60000, 0.15);
        emp[3] = new Worker(4,"N4","L4",160,20);

        // TODO поместить в объекты emp[] в объект company с помощью метода addEmployee
        for (int i = 0; i < 4; i++) {
            company.addEmployee(emp[i]);
        }

    }

    @Test
    void addEmployeeTest() {
        //check size
        assertEquals(4, company.quantity());

        //can`t add null
        assertFalse(company.addEmployee(null));

        //can`t add duplicate
        assertFalse(company.addEmployee(emp[3]));

        //can`t add one more employee
        Employee newEmp = new Worker (5,"N4","L4",160,20);
        assertTrue(company.addEmployee(newEmp));

        //check size
        assertEquals(5, company.quantity());

        //can`t add one more employee
        Employee oneMoreEmp = new Worker (6,"N6","L6",160,20);

        assertFalse(company.addEmployee(oneMoreEmp));
    }

    @Test
    void removeEmployeeTest() {
        assertEquals(emp[1], company.removeEmployee(2));
        assertEquals(3, company.quantity());

    }

    @Test
    void findEmployeeTest() {
        assertEquals(emp[2], company.findEmployee(3));
        assertNull(company.findEmployee(7));

    }

    @Test
    void updateEmployeeTest() {
    }

    @Test
    void quantityTest() {
        assertEquals(4, company.quantity());
    }

    @Test
    void printEmployeeTest() {
        company.printEmployee();
    }// методы типа void не проверяются с помощью assert

    @Test
    void totalSalaryTest() {
    }

    @Test
    void totalSalesTest() {
    }

    @Test
    void findEmployeeHoursGreaterThanTest() {
    }

    @Test
    void findEmployeeSalaryRangeTest() {
    }
}