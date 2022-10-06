public class Main {
    public static void main(String[] args) {


        //Задание №1 и 2
        System.out.println("Задание №1 и 2");


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


        //Задание 3
        System.out.println("Задание № 3");
        int year = 2004;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " является високосным ");
        } else {
            System.out.println(year + " является не високосным");
        }
        //Задание 4
        System.out.println("Задание №4");

        int needDay = 1;
        int deliveryDistance = 5;
        if (deliveryDistance > 20) {
            needDay++;
        }
        if (deliveryDistance > 60) {
            needDay++;
        }
        if (deliveryDistance > 100) {
            needDay++;
        }
        System.out.println("Потребуется дней " + needDay);

        //Задание 5
        System.out.println("Задание №5");

        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрельг");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                //уцке
        }
    }
}






