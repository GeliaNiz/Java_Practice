package practice78;
import java.util.*;
import java.util.Collections;
import java.util.Vector;
public class Company  {
    private ArrayList<Employee> employees=new ArrayList<>();
    Vector<Integer> personal_id=new Vector<>();
    private String name;
    private long income;
    Company(long income,String name){this.income=income;this.name=name;}
    void hire(Employee emp){
        int j;
        j=(int)(Math.random()*1000000);
        while(personal_id.contains(j)){
            j=(int)(Math.random()*1000000);
        }
        personal_id.add(j);
        emp.setId(j);
        employees.add(emp);
    }
    void hireAll(List<Employee>list){
        for(Employee i: list)hire(i);
    }
    void fire(int number) {
        Employee emp=null;
       for(Employee i:employees){
           if(number==i.getId()){
               emp=i;
           }
       }
       employees.remove(emp);
       personal_id.remove((Integer)number);

    }
    public double getIncome() {
        double sum=0;
        for(Employee i:employees){
            if (i.getEmpPos() instanceof Manager)sum+=((Manager) i.getEmpPos()).getIncome();
        }
        return sum;
    }
    public void setIncome(long income) {
        this.income = income;
    }
    List<Employee>getTopSalaryStaff(int count){
        if(count<=0){
            System.out.println("Вы ввели некорректное число сотрудников");
            return Collections.emptyList();
        }
        Employee temp;
        for(int i=0;i<employees.size();i++){
            temp=getEmployee(i);
            int j=i-1;
            while((j>=0) && (temp.getEmployeeSalary()>getEmployee(j).getEmployeeSalary())){
                employees.set(j+1,getEmployee(j));
                j--;
            }
            employees.set(j+1,temp);
        }
        ArrayList<Employee> emp=new ArrayList<>();
        for(int i=0;i<count;i++) emp.add(getEmployee(i));
        return emp;
    }
    List<Employee>getLowerSalaryStaff(int count){
        if(count<=0){
            System.out.println("Вы ввели некорректное число сотрудников");
            return Collections.emptyList();        }
        Employee temp;
        for(int i=0;i<employees.size();i++){
            temp=getEmployee(i);
            int j=i-1;
            while((j>=0) && (temp.getEmployeeSalary()<getEmployee(j).getEmployeeSalary())){
                employees.set(j+1,getEmployee(j));
                j--;
            }
            employees.set(j+1,temp);
        }
        ArrayList<Employee> emp=new ArrayList<>();
        for(int i=0;i<count;i++) emp.add(employees.get(i));
        return emp;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }
    public Employee getEmployee(int i){return employees.get(i);}
    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public Vector<Integer> getPersonal_id() {
        return personal_id;
    }

    public void setPersonal_id(Vector<Integer> personal_id) {
        this.personal_id = personal_id;
    }
}
