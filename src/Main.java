public class Main {
    public static void main(String[] args) {
        System.out.println("\nзадача 1");
        int salary = 15000;
        int total = 0;
        int numberMonth = 0;
        while (total < 2459000) {
            numberMonth++;
            total = total + salary;
            System.out.println("Месяц " + numberMonth + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("\nзадача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.print("\n");
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\nзадача 3");
        int year = 0;
        int people = 12000000;
        int peopleDeath = 8;
        int peoleBirth = 17;
        int population = 0;
        while (year < 10) {
            year++;
            population = people + (peoleBirth - peopleDeath) * people * year / 1000;
            System.out.println("Год " + year + " численность населения составляет " + population);
        }
        System.out.println("\nзадача 4,5");
        int deposit = 15000;
        numberMonth = 0;
        while (deposit < 12000000) {
            numberMonth++;
            deposit = deposit + deposit * 7 / 100;
            if (numberMonth % 6 == 0) {
                System.out.println("месяц " + numberMonth + " суммма накоплений равна " + deposit);
            }
        }
        System.out.println("\nзадача 6");
        deposit = 15000;
        numberMonth = 0;
        int monthInYaer = 12;
        year = 9;
        while (numberMonth < monthInYaer * year) {
            numberMonth++;
            deposit = deposit + deposit * 7 / 100;
            if (numberMonth % 6 == 0) {
                System.out.println("месяц " + numberMonth + " суммма накоплений равна " + deposit);
            }
        }
        System.out.println("\nзадача 7");
        int days = 0;
        int dayFriday = 1;
        for (; days < 31 && dayFriday < 31; ) {
            if (days % 7 == 0) {
                System.out.println("Сегодня пятница " + dayFriday + "-е число. Необходимо подготовить отчет");
            }
            days++;
            dayFriday++;
        }

        System.out.println("\nзадача 8");
        year = 2024;
        int yearStart = year - 200;
        int yearEnd = year + 100;

        while (yearStart < yearEnd) {
            if (yearStart % 79 == 0) {
                System.out.println(yearStart);
            }
            yearStart++;
        }


    }
}