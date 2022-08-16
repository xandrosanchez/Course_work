public class Employee {

    private String full_name;

    private int department;

    private double salary;

    public static int id = 0;

    public Employee(String full_name,int department, double salary){
        this.full_name = full_name;
        this.department = department;
        this.salary = salary;
        id++;
    }

    public String getFull_name() {
        return full_name;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public static int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString(){
        return id + "\n" + full_name + "\n" + department + "\n" + salary + "\n";
    }

    public static void toStringAll(Employee[] arr){
        for (Employee employee : arr) {
            System.out.println(employee);
        }
    }
}
