public class Main {
    public static void main(String[] args) {
        task2();
    }


    public static void task2() {

        //Задание №1
         System.out.println("Задание №1");


        int clientOS = 1;
        int clientOSyear = 2010;

        if (clientOS == 0) {
            if (clientOSyear > 2015) {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для IOS по ссылке");
            }
        } else {

            if (clientOSyear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void main(String[] args) {
        task3();
    }

    public static void task3() {

        int year = 2000;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " является високосным ");
        } else {
            System.out.println(year + " является не високосным");
        }
    }
}