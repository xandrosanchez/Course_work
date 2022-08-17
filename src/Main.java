public class Main {
    public static void main(String[] args) {
        Employee john1 = new Employee("Мельникова Ксения Витальевна",1,110500);
        Employee john2 = new Employee("Иванова София Ивановна",3,74000);
        Employee john3 = new Employee("Буракшаева Юлия Сергеевна",4,45000);
        Employee john4 = new Employee("Фурсова Елизавета Владимировна",1,170000);
        Employee john5 = new Employee("Сапсай Иван Алексеевич",4,163000);
        Employee john6 = new Employee("Богословский Артем Михайлович",4,178000);
        Employee john7 = new Employee("Самбикина Юлия Владимировна",1,174500);
        Employee john8 = new Employee("Шпак Ангелина Эдуардовна",5,83450);
        Employee john9 = new Employee("Пименов Максим Евгеньевич",5,64300);
        Employee john10 = new Employee("Сигида Валерия Романовна",2,230000);
        Employee[] arr = new Employee[] {john1,john2,john3,john4,john5,john6,john7,john8,john9,john10};
        toStringAll(arr);
        searchSalaryCosts(arr);
        searchMinSalary(arr);
        searchMaxSalary(arr);
        searchAverageSalary(arr);
        getAllFullNames(arr);
    }

    public static void toStringAll(Employee[] arr){
        for (Employee employee : arr) {
            System.out.println(employee);
        }
    }

    public static double searchSalaryCosts(Employee[] arr){
        double sum = 0;
        for (Employee employee : arr){
            sum = sum + employee.getSalary();
        }
        System.out.println("Затраты на зарплаты: " + sum + "\n" );
        return sum;
    }

    public static void searchMinSalary(Employee[] arr){
        double minSalary = arr[0].getSalary();
        for (Employee employee : arr){
            if (employee.getSalary() < minSalary){
                minSalary = employee.getSalary();
            }
        }
        System.out.println("Минимальная зарплата: " + minSalary + "\n");
    }

    public static void searchMaxSalary(Employee[] arr){
        double maxSalary = arr[0].getSalary();
        for (Employee employee : arr){
            if (employee.getSalary() > maxSalary){
                maxSalary = employee.getSalary();
            }
        }
        System.out.println("Максимальная зарплата: " + maxSalary + "\n");
    }

    public static void searchAverageSalary(Employee[] arr){
        System.out.println("Средняя зарплата:" + searchSalaryCosts(arr)/arr.length + "\n");
    }

    public static void getAllFullNames(Employee[] arr){
        for (Employee employee : arr){
            System.out.println(employee.getFullName());
        }
    }
}