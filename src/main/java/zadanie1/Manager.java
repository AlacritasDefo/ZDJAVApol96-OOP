package zadanie1;

import java.math.BigDecimal;

public class Manager extends Person {
    private String section;
    private BigDecimal salary;

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getSection() {
        return section;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Manager{" +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                "section='" + section + '\'' +
                ", salary=" + salary +
                '}';
    }
}