package zadanie1;

import java.math.BigDecimal;

public class Main {

        public static void main(String[] args) {

        Manager manager1 = new Manager();
        Employee employee1 = new Employee();

        employee1.setFirstName("Jakub");
        employee1.setLastName("Wójcik");
        employee1.setPosition("Mechanik");
        employee1.setSalary(BigDecimal.valueOf(2000.00));
        manager1.setFirstName("Mateusz");
        manager1.setLastName("Głowacki");
        manager1.setSection("Warsztat");
        manager1.setSalary(BigDecimal.valueOf(3500.00));

        printEmployee(employee1);


    }
    private static void printEmployee(Employee employee){
//        System.out.println(employee.getFirstName + " " + employee.getLastName + " " + employee.getPosition + " " + employee.getSalary);
    }

}
