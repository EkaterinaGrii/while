public class whiledodo {
    public static void main(String[] args) {
        task3();
    }


/* Задача1  сколько месяцев потребуется, чтобы накопить 2 459 000 рублей
 при условии, что первоначально мы имеем 0 рублей
 и готовы откладывать по 15 тысяч рублей.* */
public static void task1(){
    int moneyAccumulation= 2459000;
    int moneyStart = 0;
    short moneySave= 15000;
    int month=0;
    while(moneyStart<moneyAccumulation) {
        moneyStart=moneySave+moneyStart;
        month++;
    }
    System.out.printf("Месяц %d сумма накоплений равна %d рублей\n",month,moneyStart);
}

// Задача2 Вывести от 1 до 10 while и от 10 до 1 for
public static void task2() {
    byte i=1;
    while(i<=10) {
        System.out.printf("%d ",i);
        i++;
    }
    System.out.println();
    for(i=10;i>=1;i--) {
        System.out.printf("%d ",i);
    }
}

/*Задача3 В стране Y население — 12 миллионов человек.
Рождаемость составляет 17 человек на 1000,
смертность — 8 человек.
Рассчитайте  численность населения будет через 10 лет*/
public static void task3() {
    long population=12_000_000L;
    int fertility= 17;
    int mortality=8;
    byte year=1;
    while (year<=10) {
        population=population*(fertility-mortality)/1000;
        System.out.printf("Год %d численность населения составляет %d\n",year,population);
        year++;
    }
}








}
