package practice78;

public class Operator  implements EmployeePosition{
    private Company comp;
    Operator(Company comp){this.comp=comp;}
    @Override
    public String getJobTitle() {
        return getClass().getName();
    }

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary;
    }
}
