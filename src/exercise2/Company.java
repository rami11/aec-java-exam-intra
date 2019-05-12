package exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Company {

    private String name;
    private List<Employee> employees;

    public Company(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void add(Employee newEmployee) {
        if (!employees.contains(newEmployee)) {
            newEmployee.setCompany(this);
            employees.add(newEmployee);
        }
    }

    public void remove(Employee employee) throws CompanyManagementException {
        if (!this.employees.contains(employee)) {
            throw new CompanyManagementException(CompanyManagementException.REMOVE_EMPLOYEE);
        }
        employees.remove(employee);
    }

    @Override
    public String toString() {
        return String.format("%s:\n%s",
                this.name,
                employees.stream().map(Employee::getName).collect(Collectors.joining("\n")));
    }
}
