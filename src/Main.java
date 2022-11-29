public class Main {

    private static final Employee[] EMPLOYEES = new Employee[10];
    public static void main(String[] args) {
        EMPLOYEES[0] = new Employee("Давыдов Евгений Петрович", 1, 180000);
        EMPLOYEES[1] = new Employee("Глухомань Алексей Владимирович", 2, 80000);
        EMPLOYEES[2] = new Employee("Сеттер Андрей Игоревич", 3, 60000);
        EMPLOYEES[3] = new Employee("Геттер Владимир Петрович", 4, 65000);
        EMPLOYEES[4] = new Employee("Селдерей Петр Петрович", 5, 90000);
        EMPLOYEES[5] = new Employee("Эмплой Сергей Анатольевич", 1, 76000);
        EMPLOYEES[6] = new Employee("Зюзя Антон Леонидович", 2, 76000);
        EMPLOYEES[7] = new Employee("Вултузов Геннадий Андреевич", 3, 62000);
        EMPLOYEES[8] = new Employee("Околотого Сергей Сергеевич", 4, 85000);
        EMPLOYEES[9] = new Employee("Петров Иван Сергеевич", 5, 90000);

        printAllInformation();
        int amountSalaries = getAmountSalaries();
        System.out.println("Общая сумма Зарплат: " + amountSalaries);
        Employee employeeMinSalary = searchEmployeeMinSalary();
        System.out.println("Сотрудник с минимальной Зарплатой: " + employeeMinSalary);
        Employee employeeMaxSalary = searchEmployeeMaxSalary();
        System.out.println("Сотрудник с максимальной Зарплатой: " + employeeMaxSalary);
        int averageSalary = searchAverageSalary();
        System.out.println("Средняя Зарплата: " + averageSalary);
        printAllNameInformation();

    }

    private static void printAllInformation() {
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }

    private static int getAmountSalaries() {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                sum = sum + employee.getSalary();
            }
        }
        return sum;
    }

    private static Employee searchEmployeeMinSalary() {
        int min = Integer.MAX_VALUE;
        Employee employeeMinSalary = null;
        for (Employee employee : EMPLOYEES) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                employeeMinSalary = employee;

            }
        }
        return employeeMinSalary;
    }

    private static Employee searchEmployeeMaxSalary() {
        int min = Integer.MIN_VALUE;
        Employee employeeMaxSalary = null;
        for (Employee employee : EMPLOYEES) {
            if (employee != null && employee.getSalary() > min) {
                min = employee.getSalary();
                employeeMaxSalary = employee;

            }
        }
        return employeeMaxSalary;
    }

    private static int searchAverageSalary() {
        return getAmountSalaries() / EMPLOYEES.length;
    }

    private static void printAllNameInformation() {
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
}