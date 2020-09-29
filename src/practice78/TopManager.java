package practice78;

public class TopManager  implements EmployeePosition {
    private Company comp;
    TopManager(Company comp){this.comp=comp;}

    @Override
    public String getJobTitle() {
        return getClass().getName();
    }

    @Override
    public double calcSalary(double baseSalary) {
        if(comp.getIncome()>10000000)
            return 2.5*baseSalary;
        else return baseSalary;
    }
}
