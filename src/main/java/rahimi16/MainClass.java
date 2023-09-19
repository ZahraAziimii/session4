package rahimi16;

import rahimi16.model.*;
import rahimi16.model.Marketer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        List<Employee> employeeList = new ArrayList<>();
        Employee employee = new Employee("0016684631", "zahra", 300000000d, 2d);
        Employee employee1 = new Employee("00164587214", "erfan", 5000000000d, 3d);
        System.out.println(salaryCalculator.calculateSalary(employee));
        System.out.println(salaryCalculator.calculateSalary(employee));
        HR hr = new HR("00125524857", "hosein", 7800000000d, 1d);
        Manager manager = new Manager();
        Employee manager2 = new Manager();/**polimorfism(chand rikhti)*/
        Employee hr1 = new HR("0015487", "ali", 78000000d, 3d);
        Marketer marketer = new Marketer();
        Driver driver = new Driver();
        employeeList.addAll(Arrays.asList(employee, employee1));
    }
}
