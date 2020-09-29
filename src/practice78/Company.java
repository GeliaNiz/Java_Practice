package practice78;

import java.util.ArrayList;
import java.util.Collections;
public class Company  {
    private ArrayList<Employee> employees=new ArrayList<>();
    private long income;
    Company(long income){this.income=income;}
    void hire(Employee emp){employees.add(emp);}
    void hireAll(ArrayList<Employee>list){
        for(Employee i:list){
            employees.add(i);
        }
    }
    void fire(int kolvo) {
        for (int i = 0; i < kolvo; i++) {
            employees.remove(i);
        }
    }


    public long getIncome() {
        return income;
    }

    public void setIncome(long income) {
        this.income = income;
    }

    ArrayList<Employee>getTopSalaryStaff(int count){
        Employee temp;
        for(int i=0;i<employees.size();i++){
            temp=getEmployee(i);
            int j=i-1;
            while((j>=0) && (temp.getEmpPos().calcSalary(temp.getSalary())>getEmployee(j).getEmpPos().calcSalary(getEmployee(j).getSalary()))){
                employees.set(j+1,getEmployee(j));
                j--;
            }
            employees.set(j+1,temp);
        }
        ArrayList<Employee> emp=new ArrayList<>();
        for(int i=0;i<count;i++) emp.add(getEmployee(i));
        return emp;
    }
    ArrayList<Employee>getLowerSalaryStaff(int count){
        Employee temp;
        for(int i=0;i<employees.size();i++){
            temp=getEmployee(i);
            int j=i-1;
            while((j>=0) && (temp.getEmpPos().calcSalary(temp.getSalary())<getEmployee(j).getEmpPos().calcSalary(getEmployee(j).getSalary()))){
                employees.set(j+1,getEmployee(j));
                j--;
            }
            employees.set(j+1,temp);
        }
        ArrayList<Employee> emp=new ArrayList<>();
        Collections.reverseOrder();
        for(int i=0;i<count;i++) emp.add(employees.get(i));
        return emp;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }
    public Employee getEmployee(int i){return employees.get(i);}
    public double getEmployeeSalary(int i){return employees.get(i).getSalary();}
    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
}
