package Practice9;
import java.util.ArrayList;
public class Company {
    private ArrayList<Employee> employees=new ArrayList<>();
    public void hire(int count,ArrayList<Employee> emp){
        employees.addAll(emp);
    }
    public void fire(int count,ArrayList<Employee>emp){
       for(Employee i:emp)employees.remove(i);
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
 public void doSomething(EmployeeSelector selector,HandleEmployees handler){
        for(Employee i:employees){
            if(selector.isNeededEmployee(i)) handler.HandlerEmployee(i);
        }
 }
 public void ShowAll(){
        for(Employee i:employees)System.out.println(i.toString());
 }
    @Override
    public String toString() {
        return "Company{" +
                "employees=" + employees +
                '}';
    }
}
