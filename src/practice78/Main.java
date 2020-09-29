package practice78;

import java.util.ArrayList;

public class Main {
    public static void main(String[]args) {
        Company company = new Company(50000000);
        ArrayList<Employee> emp = new ArrayList<>();
        for (int i = 0; i < 180; i++) {
            emp.add(new Employee("w1", "w", (int)(Math.random() * 5000), new Operator(company)));
        }
        company.hireAll(emp);
        System.out.println();
        emp.clear();
        emp=company.getTopSalaryStaff(7);
        System.out.println("Добавили и отсортировали по Top salary операторов");
        for (int i = 0; i < 7; i++) {
            System.out.println(company.getEmployeeSalary(i));
        }
        emp.clear();
        for (int i = 0; i < 80; i++) {
            emp.add(new Employee("w4", "c", (int) (Math.random() * 5000), new Manager(company)));

        }
        company.hireAll(emp);
        System.out.println();
        emp.clear();
        emp=company.getTopSalaryStaff(5);
        System.out.println("Добавили менеджеров и снова отсортировали по Top salary");
        for (int i = 0; i < 5; i++) {
            System.out.println(company.getEmployeeSalary(i));
        }
        emp.clear();
        for (int i = 0; i < 10; i++) {
            emp.add(new Employee("www", "o", (int) (Math.random() * 5000), new TopManager(company)));
        }
        System.out.println();
        company.hireAll(emp);
        emp.clear();
        emp=company.getTopSalaryStaff(6);
        System.out.println("Добавили топ менеджеров и отсортировали по Top salary");
        for (int i = 0; i < 6; i++) {
            System.out.println(company.getEmployeeSalary(i));
        }
        emp.clear();
        emp=company.getTopSalaryStaff(15);
        System.out.println("Снова отсортировали по Top salary");
        for (int i = 0; i < 15; i++) {
            System.out.println(company.getEmployeeSalary(i));
        }
        System.out.println();

        System.out.println("Отсортировали по Low salary");
        emp=company.getLowerSalaryStaff(30);
        for (int i = 0; i < 30; i++) {
            System.out.println(company.getEmployeeSalary(i));
        }
        System.out.println();
        emp.clear();
        company.fire(company.getEmployees().size()/2);
        System.out.println("Кол-во сотрудников после увольнения половины "+company.getEmployees().size());
        emp=company.getTopSalaryStaff(15);
        System.out.println("Отсортировали по Top salary");
        for (int i = 0; i < 15; i++) {
            System.out.println(company.getEmployeeSalary(i));
        }
        emp.clear();
        emp=company.getLowerSalaryStaff(30);
        System.out.println("Отсортировали по Low salary");
        for (int i = 0; i < 30; i++) {
            System.out.println(company.getEmployeeSalary(i));
        }

            }
        }



