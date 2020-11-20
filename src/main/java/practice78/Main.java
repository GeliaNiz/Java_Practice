package practice78;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int k;
        Company company = new Company(50000000, "Cool company");
        List<Employee> emp = new ArrayList<>();
        for (int i = 0; i < 180; i++) {
            emp.add(new Employee("w1", "w", (int) (Math.random() * 200000 + 8000), new Operator(company)));
        }
        company.hireAll(emp);
        System.out.println();
        emp.clear();
        for (int i = 0; i < 80; i++) {
            emp.add(new Employee("w4", "c", (int) (Math.random() * 300000 + 15000), new Manager(company)));
        }
        company.hireAll(emp);
        emp.clear();
        for (int i = 0; i < 10; i++) {
            emp.add(new Employee("www", "o", (int) (Math.random() * 400000 + 20000), new TopManager(company)));
        }
        company.hireAll(emp);
        emp = company.getTopSalaryStaff(-15);
        System.out.println("Отсортировали по Top salary");
        for (Employee i : emp) {
            System.out.println((int) i.getEmployeeSalary() + " руб.");
        }
        System.out.println();
        emp = company.getLowerSalaryStaff(30);

        System.out.println("Отсортировали по Low salary");
        for (Employee i : emp) {
            System.out.println((int) i.getEmployeeSalary() + " руб.");
        }
        System.out.println();

        k=company.getPersonal_id().size();
        for (int i = 0; i < k/ 2; i++) {
            company.fire(company.getPersonal_id().get((int)(Math.random()*company.getPersonal_id().size())));
        }

        System.out.println("Кол-во сотрудников после увольнения половины " + company.getEmployees().size());
        emp = company.getTopSalaryStaff(15);

        System.out.println("Отсортировали по Top salary");
        for (Employee i : emp) {
            System.out.println((int) i.getEmployeeSalary() + " руб.");

        }
        emp = company.getLowerSalaryStaff(-7);
        System.out.println("Отсортировали по Low salary");
        for (Employee i : emp) {
            System.out.println((int) i.getEmployeeSalary() + " руб.");


        }
    }
}



