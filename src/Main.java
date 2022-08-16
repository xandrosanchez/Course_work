public class Main {
    public static void main(String[] args) {
        Employee john1 = new Employee("ss1",2,12);
        Employee john2 = new Employee("ss2",2,12);
        Employee john3 = new Employee("ss3",2,12);
        Employee john4 = new Employee("ss4",2,12);
        Employee john5 = new Employee("ss5",2,12);
        Employee john6 = new Employee("ss6",2,12);
        Employee john7 = new Employee("ss7",2,12);
        Employee john8 = new Employee("ss8",2,12);
        Employee john9 = new Employee("ss9",2,12);
        Employee john10 = new Employee("ss10",2,12);
        Employee[] arr = new Employee[] {john1,john2,john3,john4,john5,john6,john7,john8,john9,john10};
        toStringAll(arr);
    }

    public static void toStringAll(Employee[] arr){
        for (Employee employee : arr) {
            System.out.println(employee);
        }
    }
}