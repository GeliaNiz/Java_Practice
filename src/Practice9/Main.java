package Practice9;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Company company=new Company();
        Random rd=new Random();
        int k=450;
        Scanner sc=new Scanner(System.in);
        ArrayList<Employee> emp=new ArrayList<>();
        emp.add(new Employee("Katya","hhhh","bjdsbgjkbsfjgk", LocalDate.of(1998,3,10),
                "+7"+(rd.nextInt(8999999)+1000000),7000));
        emp.add(new Employee("Sasha","hhhh","bjdsbgjkbsfjgk", LocalDate.of(1998,3,10),
                "+7"+(rd.nextInt(8999999)+1000000),4000));
        emp.add(new Employee("Katya","hhhh","bjdsbgjkbsfjgk", LocalDate.of(1998,3,10),
                "+7"+(rd.nextInt(8999999)+1000000),300));
        emp.add(new Employee("Katya","hhhh","bjdsbgjfjgk", LocalDate.of(1998,3,10),
                "+7"+(rd.nextInt(8999999)+1000000),7060));
        emp.add(new Employee("Sasha","hhhh","bjdsbgjkbsfjgk", LocalDate.of(1998,3,10),
                "+7"+(rd.nextInt(8999999)+1000000),90));
        emp.add(new Employee("Katya","hhhh","bjdsbgjkbsfjgk", LocalDate.of(1998,3,10),
                "+7"+(rd.nextInt(8999999)+1000000),380));
        company.hire(6,emp);

        company.doSomething(e->e.getName()=="Katya",
                (e-> System.out.println(e.toString())));
        company.doSomething(new EmployeeSelector() {
                                @Override
                                public boolean isNeededEmployee(Employee employee) {
                                    return employee.getSalary() > 450;
                                }
                            }, new HandleEmployees() {
                                @Override
                                public void HandlerEmployee(Employee employee) {
                                    System.out.println("salary : "+ employee.getSalary());
                                }
                            }
        );
        company.doSomething(new PhoneNumberSelector(),new HandlerSalary());
       company.ShowAll();


    }
}
