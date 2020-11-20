package practice78;
public class Employee {
    private String name;
    private String surname;
    private double salary;
    private int id;
    EmployeePosition employeePosition;
    Employee(String name,String surname,int salary,EmployeePosition emp){
        this.name=name;
        this.surname=surname;
        this.salary=salary;
        employeePosition=emp;
    }
    public double getEmployeeSalary(){return employeePosition.calcSalary(salary);}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public EmployeePosition getEmpPos() {
        return employeePosition;
    }
    public void setEmployeePosition(EmployeePosition employeePosition) {
        this.employeePosition = employeePosition;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + employeePosition.calcSalary(salary) +
                ", employeePosition=" + employeePosition.getJobTitle() +
                '}';
    }
}
