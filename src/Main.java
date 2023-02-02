public class Main {
    public static void main(String[] args) {
        leapYear(2021);
        app(2014, 1);
        deliveryDay(10);
    }

    public static void leapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }


    public static void app(int clientDeviceYear, int clientOS) {

        if (clientOS == 0) {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void deliveryDay(int deliveryDistance) {
        int deliveryDay = 1;

        if (deliveryDistance > 100) {
            System.out.println("Свыше 100 км доставки нет.");
        } else {
            if (deliveryDistance > 20) {
                deliveryDay++;
            }
            if (deliveryDistance > 60) {
                deliveryDay++;
            }
            System.out.println("Потребуется дней для доставки: " + deliveryDay);
        }
    }
}