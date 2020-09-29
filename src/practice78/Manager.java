package practice78;

public class Manager  implements EmployeePosition {
    private Company comp;
    private double salary;
    Manager(Company comp){
        salary=Math.random()*25000+115000;
        this.comp=comp;}
    @Override
    public String getJobTitle() {
        return getClass().getName();
    }

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary+0.05*salary;
    }
}
