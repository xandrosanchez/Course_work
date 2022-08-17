import org.w3c.dom.css.Counter;

public class Employee {

    private String fullName;

    private int department;

    private double salary;

    public static int counter;

    private int id;

    public Employee(String full_name,int department, double salary){
        this.fullName = full_name;
        this.department = department;
        this.salary = salary;
        id = Employee.getCounter();
        counter++;
    }


    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Личный номер:" + id + "\nФИО:" + fullName + "\nОтдел:" + department + "\nЗарплата:" + salary + "\n";
    }

}
