package Practice9;
import java.time.LocalDate;
public class Employee {
 final private String name;
 final private String surname;
 private String address;
 final private LocalDate date_of_birth;
 private String phone_number;
 private int salary;

    public Employee(String name, String surname, String address, LocalDate date_of_birth, String phone_number, int salary) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.date_of_birth = date_of_birth;
        this.phone_number = phone_number;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDate_of_birth() {
        return date_of_birth;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", date_of_birth=" + date_of_birth +
                ", phone_number='" + phone_number + '\'' +
                ", salary=" + salary +
                '}';
    }
}
