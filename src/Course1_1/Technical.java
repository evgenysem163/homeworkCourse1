package Course1_1;

import javax.lang.model.element.Name;
import java.util.Arrays;
import java.util.Objects;

public class Technical {
    private final Employee[] employees;
    private int size;

    public Technical() {
        this.employees = new Employee[10];
    }

    public void addEmployees(String empName, int empDepartment, double empSalary) {
        if (size >= employees.length) {
            System.out.println("нельзя добавить сотрудника");
        } else {
            Employee newEmployee = new Employee(empName, empDepartment, empSalary);
            employees[size++] = newEmployee;
        }
    }

    public void printEmployee() {          // Создаем метод printEmployee который ни чего не возвращает void
        for (int i = 0; i < size; i++) {    // Создаем цикл, в котором пробегаем по длинне всего массива size
            Employee employee = employees[i]; // Обрщаемся к нашему классу Employee где храняться данные о сотрудниках, приравнием его к нашему массиву employees[i]
            System.out.println(employee);     // выводим на экран ВЕСЬ! массив данных
        }
    }

    public void printEmployeeOne() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i].getName());

        }
    }

    public double sumSalary() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + employees[i].getSalary();
        }
        return sum;
    }
    public String sumMaxSalary() {
        String sumMaxx = "";
        double sumMax = 0;                  // Создаем переменную равную 0 sumMax
        for (int i = 0; i < size; i++) {     // Создаем цикл, который пробегает по всей длинне массива size
            if (employees[i].getSalary() > sumMax) { // Создаем условие, если индекс массива а именно ячейка зарплаты employees[i].getSalary() где getSalary() это метод нашего класса Employee куда передается наша зарпалата введенная в ручную больше 0 sumMax
                sumMaxx = employees[i].getName();
                sumMax = employees[i].getSalary();// Если условие верно(true) тогда мы к sumMax которое равно 0 присвиваем идекс массива а именно ячейку зарплаты employees[i].getSalary()
            }
        }
        return sumMaxx + sumMax;
        // Возвращаем полученый результат тобишь, sumMax = employees[i].getSalary()
    }
    public String sumMinSalary() {
        String sumMinn = "";
       double min = employees[0].getSalary();// Создаем переменную min где, присваиваем ей значение индекса 0 а это в свое время первый элемент массива employee[0], через точку берем первый элемент зарплаты getSalary()
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() < min) {
                min =  employees[i].getSalary();
                sumMinn =employees[i].getName();

            }
        }
        return sumMinn + min;
    }


    public double midSalary() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + employees[i].getSalary() / size;
        }
        return sum;
    }


    @Override
    public String toString() {
        return "Technical{" +
                "employees=" + Arrays.toString(employees) +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Technical technical = (Technical) o;
        return size == technical.size && Arrays.equals(employees, technical.employees);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size);
        result = 31 * result + Arrays.hashCode(employees);
        return result;
    }
}










