package rahimi16;

import rahimi16.model.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalaryCalculator<T extends Employee> {

    public Double calculateSalary(T employee) {
       return employee.getSalary() - calculateTax(employee);
    }

    private Double calculateTax(T employee) {
        /**این متد به صورت اختیاری است**/
       return employee.getSalary()* employee.getTaxRate()/100*2;
    }

    public Map<String, Double> calculateSalary(List<T> employees) {
        Map<String,Double> result = new HashMap<>();
        for (T employee:employees) {
            result.put(employee.getnId(),calculateSalary(employee));

        }
        return result;
    }

}
