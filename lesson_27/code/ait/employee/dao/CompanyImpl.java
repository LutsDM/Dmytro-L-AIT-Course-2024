package ait.employee.dao;

import ait.employee.model.Employee;
import ait.employee.model.SalesManager;
import classwork_28.car_garage.ait.cars.model.Car;

import java.util.function.Predicate;

public class CompanyImpl implements Company {

    private Employee[] employees;
    private int size;

    // capacity - возможное кол-во сотрудников
    public CompanyImpl(int capacity) {
        this.employees = new Employee[capacity];
        this.size = size;
    }

    @Override
    public boolean addEmployee(Employee employee) {
        // bad cases
        if (employee == null) {
            return false;
        }
        if (size == employees.length) {
            return false;
        }
        if (!(findEmployee(employee.getId()) == null)) {
            return false;
        }
        // good case
        employees[size] = employee;
        size++;
        return true;

    }

    @Override
    public Employee removeEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id) {
                Employee victim = employees[i];
                employees[i] = employees[size - 1];
                employees[size - 1] = null;
                size--;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id) {
                return employees[i];
            }
        }
        return null;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return null;
    }

    @Override
    public int quantity() {

        return size;
    }

    @Override
    public void printEmployee() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);

        }

    }

    @Override
    public double totalSalary() {
        double totalSalary = 0;
        for (int i = 0; i < size; i++) {
            totalSalary += employees[i].calcSalary();
        }
        return totalSalary;
    }

    @Override
    public double totalSales() {
        double totalSales = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i] instanceof SalesManager) {
                SalesManager sm = (SalesManager) employees[i];
                totalSales += sm.getSalesValue();
            }
        }
        return totalSales;
    }

    @Override
    public Employee[] findEmployeeHoursGreaterThan(int hours) {
        return findEmployeeByPredicate(employee -> employee.getHours() > hours);
    }

    @Override
    public Employee[] findEmployeeSalaryRange(double min, double max) {
        return findEmployeeByPredicate(employee -> employee.calcSalary() >= min && employee.calcSalary() <= max);
    }

    private Employee[] findEmployeeByPredicate(Predicate<Employee> predicate) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (predicate.test(employees[i])) { // объект проходит тест
                count++;
            }
        }

        // читаем массив и перекладываем рез-ты в новый
        Employee[] res = new Employee[count];
        for (int i = 0, j = 0 ; j < res.length; i++) {
            if(predicate.test(employees[i])){
                res[j++] = employees[i];
            }
        }
        return res;
    }

}//end of class
