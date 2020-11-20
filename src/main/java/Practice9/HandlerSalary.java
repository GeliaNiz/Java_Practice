package Practice9;

public class HandlerSalary implements HandleEmployees{
    @Override
    public void HandlerEmployee(Employee employee) {
        employee.setSalary(employee.getSalary()+1000);
    }
}
