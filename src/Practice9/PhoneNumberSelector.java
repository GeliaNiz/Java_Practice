package Practice9;

public class PhoneNumberSelector implements EmployeeSelector{
    @Override
    public boolean isNeededEmployee(Employee employee) {
        if(employee.getPhone_number().charAt(employee.getPhone_number().length()-1)=='5')
            return true;
        return false;
    }
}
