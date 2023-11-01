public class whiledodo {
    public static void main(String[] args) {
        task3();
    }


    /* Задача1  сколько месяцев потребуется, чтобы накопить 2 459 000 рублей
     при условии, что первоначально мы имеем 0 рублей
     и готовы откладывать по 15 тысяч рублей.* */
    public static void task1() {
        int moneyAccumulation = 2459000;
        int moneyStart = 0;
        short moneySave = 15000;
        int month = 0;
        while (moneyStart < moneyAccumulation) {
            moneyStart = moneySave + moneyStart;
            month++;
        }
        System.out.printf("Месяц %d сумма накоплений равна %d рублей\n", month, moneyStart);
    }

    // Задача2 Вывести от 1 до 10 while и от 10 до 1 for
    public static void task2() {
        byte i = 1;
        while (i <= 10) {
            System.out.printf("%d ", i);
            i++;
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.printf("%d ", i);
        }
    }

    /*Задача3 В стране Y население — 12 миллионов человек.
    Рождаемость составляет 17 человек на 1000,
    смертность — 8 человек.
    Рассчитайте  численность населения будет через 10 лет*/
    public static void task3() {
        int population = 12000000;
        float fertility = 0.017f;
        float mortality = 0.008f;
        byte year = 1;
        while (year <= 10) {
            population += population * (fertility - mortality);
            System.out.printf("Год %d численность населения составляет %d\n", year, population);
            year++;
        }
    }


    /* Задача4 Каждый месяц к сумме вклада добавляется 7%
    Первоначальная сумма вклада — 15 тысяч рублей
    Сколько месяцев нужно будет накопить 12 миллионов рублей
    Выведите результат с указанием суммы по каждому месяцу.*/
    public static void task4() {
        byte rate = 7;
        int moneyStart = 15000;
        int moneyDream = 12000000;
        int month = 1;
        while (moneyStart < moneyDream) {
            moneyStart += (moneyStart * 7 / 100);
            System.out.printf("За %d месяц сумма накоплений %d\n", month, moneyStart);
            month++;
        }
    }


    //Задача5 Вывод каждого 6го месяца
    public static void task5() {
        byte rate = 7;
        int moneyStart = 15000;
        int moneyDream = 12000000;
        int month = 1;
        while (moneyStart < moneyDream) {
            moneyStart += (moneyStart * 7 / 100);
            if (month % 6 == 0) {
                System.out.printf("За %d месяц сумма накоплений %d\n", month, moneyStart);
            }
            month++;
        }
    }


    /*Задача6 Kопить 9 лет
    Какой будет сумма каждые полгода */
    public static void task6() {
        byte rate = 7;
        int moneyStart = 15000;
        byte yearSaveUp = 9;
        int month = 1;
        while (month <= 108) {
            moneyStart += (moneyStart * 7 / 100);
            if (month % 6 == 0) {
                System.out.printf("За %d месяц сумма накоплений %d\n", month, moneyStart);
            }
            month++;
        }
    }


    /*Задача7 Cчитает дни месяца по датам, определяет, какой день — пятница
    Сообщение «Сегодня пятница, ...-е число. Необходимо подготовить отчет».
    месяце 31 день
    4-5выводов*/
    public static void task7() {
        int fridayFirst = 5;
        byte month = 31;
        do {
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет\n", fridayFirst);
            fridayFirst = fridayFirst + 7;
        }
        while (fridayFirst <= month);


    }


    /*Задача8 Комета пролетает каждый 79-й год, начиная с нулевого.
    Вывести все годы за последние 200 лет и следующий год появления*/
    public static void task8() {
        short yearStart = 1823;
        short yearEnd = 2123;
        byte yearComet = 79;
        short year = 0;
        for (year = 0; year <= yearEnd; year += 79) {
            if (year >= yearStart) {
                System.out.println(year);
            }
        }


    }


}