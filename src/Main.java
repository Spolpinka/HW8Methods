import java.time.LocalDate;

public class Main {
    static int year = 2022;
    static int typeOS = 0; //0 - iOS, 1 - Android

    public static void isLeap(int year) {
        if (year % 4 == 0 && ((year & 100) != 0 || year % 400 == 0)) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }

    }

    public static void isActual(int typeOS, int yearOrigin) {
        int currentYear = LocalDate.now().getYear();
        if (currentYear > yearOrigin) {
            System.out.printf("Установите облегченную версию приложения для %s по ссылке", typeOS == 0 ? "iOS" : "Android");
        } else {
            System.out.printf("Установите обычную версию приложения для %s по ссылке", typeOS == 0 ? "iOS" : "Android");
        }
    }

    public static int deliveryTime(int distance) {
        int k = 1;
        if (distance > 20) {
            k += (distance - 20) / 40 + 1;
        }
        return k;
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    {
    }

    public static void task1() {
        System.out.println("Задание № 1");
        isLeap(year);
    }

    public static void task2() {
        System.out.println("Задание № 2");
        isActual(typeOS, year);
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задание № 3");
        int deliveryDistance = 150;
        System.out.println("Потребуется дней: " + deliveryTime(deliveryDistance));
    }
}