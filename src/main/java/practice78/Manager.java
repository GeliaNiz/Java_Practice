package practice78;
public class Manager  implements EmployeePosition {
    private Company comp;
    private double income;
    Manager(Company comp){
        income=Math.random()*25000+115000;
        this.comp=comp;}
    @Override
    public String getJobTitle() {
        return getClass().getName();
    }

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary+0.05*income;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }
}
