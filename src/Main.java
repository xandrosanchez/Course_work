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
//        toStringAll(arr);
//        searchSalaryCosts(arr);
//        searchMinSalary(arr);
//        searchMaxSalary(arr);
//        searchAverageSalary(arr);
//        getAllFullNames(arr);
        indexingSalary(arr,5);
        System.out.println(searchMinSalary(4, arr));
        System.out.println(searchSalaryCosts(1, arr));
        System.out.println(searchAverageSalary(1,arr));
        indexingSalary(arr,100,1);
        System.out.println(searchSalaryCosts(1, arr));
        printEmployees(arr,5);
        printEmployeesWithLowerSalaries(arr, 100000);
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

    public static void indexingSalary(Employee[] arr,double percent){
        for (Employee employee : arr){
            employee.setSalary(employee.getSalary() * (1 + percent/100));
        }
    }

    public static Employee searchMinSalary(int department,Employee[] arr){
        double salary = 0;
        int ID = 0;
        for (Employee employee : arr){
            if (employee.getDepartment() == department){
                salary = employee.getSalary();
            }
        }
        for (Employee employee : arr){
            if (employee.getDepartment() == department){
                if (employee.getSalary() < salary){
                    salary = employee.getSalary();
                    ID = employee.getId();
                }
            }
        }
        return arr[ID];
    }

    public static Employee searchMaxSalary(int department,Employee[] arr){
        double salary = 0;
        int ID = 0;
        for (Employee employee : arr){
            if (employee.getDepartment() == department){
                salary = employee.getSalary();
            }
        }
        for (Employee employee : arr){
            if (employee.getDepartment() == department){
                if (employee.getSalary() > salary){
                    salary = employee.getSalary();
                    ID = employee.getId();
                }
            }
        }
        return arr[ID];
    }

    public static double searchSalaryCosts(int department,Employee[] arr){
        double sum = 0;
        for (Employee employee :arr){
            if (employee.getDepartment() == department){
                sum = sum + employee.getSalary();
            }
        }
        return sum;
    }

    public static double searchAverageSalary(int department,Employee[] arr){
        int amount = 0;
        for (Employee employee :arr){
            if (employee.getDepartment() == department){
                amount++;
            }
        }
        return searchSalaryCosts(department,arr)/amount; //как я могу здесь сделать только 2 знака после запятой?
    }

    public static void indexingSalary(Employee[] arr,double percent,int department){
        for (Employee employee : arr){
            if (employee.getDepartment() == department){
                employee.setSalary(employee.getSalary() * (1 + percent/100));
            }
        }
    }

    public static void printEmployees(Employee[] arr,int department){
        for (Employee employee : arr){
            if (employee.getDepartment() == department){
                System.out.println(employee.getId());
                System.out.println(employee.getFullName());
                System.out.println(employee.getSalary());
                System.out.println();
            }
        }
    }

    public static void printEmployeesWithLowerSalaries(Employee[] arr, double salary){
        for (Employee employee : arr){
            if (employee.getSalary() < salary){
                System.out.println(employee);
                System.out.println();
            }
        }
    }

    public static void printEmployeesWithHigherSalaries(Employee[] arr, double salary){
        for (Employee employee : arr){
            if (employee.getSalary() >= salary){
                System.out.println(employee);
                System.out.println();
            }
        }
    }






}