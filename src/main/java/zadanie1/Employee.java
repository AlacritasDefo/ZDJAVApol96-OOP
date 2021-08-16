package zadanie1;

import java.math.BigDecimal;
;

public class Employee extends Person {
    private String position;
    private BigDecimal salary;

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                "position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
