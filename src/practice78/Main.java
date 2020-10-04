package practice78;
import java.util.ArrayList;
import java.util.Vector;
public class Main {
    public static void main(String[] args) {
        int k;
        Vector<Integer> id = new Vector<>();
        Company company = new Company(50000000,"Cool company");
        ArrayList<Employee> emp = new ArrayList<>();
        for (int i = 0; i < 180; i++) {
            emp.add(new Employee("w1", "w", (int) (Math.random() * 200000+8000), new Operator(company)));
        }
        company.hireAll(emp);
        System.out.println();
        emp.clear();
            for (int i = 0; i < 80; i++) {
                emp.add(new Employee("w4", "c", (int) (Math.random() * 300000+15000), new Manager(company)));
        }
            company.hireAll(emp);
            emp.clear();
            for (int i = 0; i < 10; i++) {
                emp.add(new Employee("www", "o", (int) (Math.random() * 400000 + 20000), new TopManager(company)));
            }
            company.hireAll(emp);
            emp.clear();
        if (company.getTopSalaryStaff(-15) != null) {
            System.out.println("Отсортировали по Top salary");
            for (int i = 0; i < 15; i++) {
                System.out.println((int)company.getEmployeeSalary(i)+" руб.");
            }
            System.out.println();
        }
        company.getLowerSalaryStaff(30);
        if(company.getLowerSalaryStaff(30)!=null) {
            System.out.println("Отсортировали по Low salary");
            for (int i = 0; i < 30; i++) {
                System.out.println((int)company.getEmployeeSalary(i)+ " руб.");
            }
            System.out.println();
        }

        outer: for (int i = 0; i < company.getEmployees().size()/2; i++){
            k=(int)(Math.random() * company.getEmployees().size());
            for(int j=0;j<id.size();j++) if (k == id.get(j)) continue outer;
            id.add(k);
        }
        company.fire(company.getEmployees().size() / 2, id);
        System.out.println("Кол-во сотрудников после увольнения половины " + company.getEmployees().size());
        if(company.getTopSalaryStaff(15)!=null) {
            System.out.println("Отсортировали по Top salary");
            for (int i = 0; i < 15; i++) {
                System.out.println((int)company.getEmployeeSalary(i)+ " руб.");
            }
        }
        if (company.getLowerSalaryStaff(-30) != null) {
            System.out.println("Отсортировали по Low salary");
            for (int i = 0; i < 30; i++) {
                System.out.println((int)company.getEmployeeSalary(i)+" руб. ");
            }

        }
    }
}



