package exercise2;

import java.util.Objects;

public class Employee {

    private String name;
    private Company company;

    public Employee(String name) {
        this(name, new Company("N/A"));
    }

    public Employee(String name, Company company) {
        this.name = name;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) &&
                Objects.equals(company, employee.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company);
    }

    @Override
    public String toString() {
        return String.format("%s\t%s", this.name, this.company.getName());
    }
}
