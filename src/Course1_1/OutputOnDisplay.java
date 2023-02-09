package Course1_1;

public class OutputOnDisplay {
    public static void main(String[] args) {

        Technical emp = new Technical();
        emp.addEmployees(" Семирязев Евгений Николаевич ", 1, 55388);
        emp.addEmployees(" Смирнов Алексей Олегович     ", 2, 435345);
        emp.addEmployees(" Закиров Наиль Радикович      ", 3, 42564);
        emp.addEmployees(" Валынков Денис Владимирович  ", 4, 51874);
        emp.addEmployees(" Мишин Сергей Андреевич       ", 5, 47306);
        emp.addEmployees(" Весов Андрей Леонидович      ", 6, 50930);
        emp.addEmployees(" Кудлов Анрей Леонидович      ", 7, 48320);
        emp.addEmployees(" Зубов Роман Даниилович       ", 8, 57043);
        emp.addEmployees(" Костин Федор Макарович       ", 9, 58000);
        emp.addEmployees(" Астахов Данил Олегович       ", 10,45500);
        emp.printEmployee();
        System.out.println();
        System.out.println(" Общая сумма зарплат "  + emp.sumSalary() + " рублей ");
        System.out.println();
        System.out.println( " Сотрудник с максимальной зарплатой  " + emp.sumMaxSalary() + " рублей ");
        System.out.println();
        System.out.println(" Сотрудник с минимальной зарплатой "    + emp.sumMinSalary() + " рублей ");
        System.out.println();
        System.out.printf(" Среднее значение зарплаты %.2f рублей",   emp.midSalary());
        System.out.println();
        System.out.println();
        emp.printEmployeeOne();
    }

}
