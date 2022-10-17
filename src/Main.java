public class Main {
    public static void main(String[] args) {


        int clientOS = 1;
        int clientDeviceYear = 2015;



        if (clientOS > 0) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке.");

        }
        if ((clientDeviceYear < 2016) && (clientOS > 0)) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке.");
        }
        


       int deliveryDistance = 15;

       if (deliveryDistance >= 60) {
           System.out.println("Потребуется дней: 3" );
       } else if (deliveryDistance >= 20) {
           System.out.println("Потребуется дней: 2" );
       } else if (deliveryDistance >= 0) {
           System.out.println("Потребуется дней: 1" );
       }



       int monthNumber = 14;

       switch (monthNumber) {
           case 12:
           case 1:
           case 2:
               System.out.println("Зима");
               break;
           case 3:
           case 4:
           case 5:
               System.out.println("Весна");
               break;
           case 6:
           case 7:
           case 8:
               System.out.println("Лето");
               break;
           case 9:
           case 10:
           case 11:
               System.out.println("Осень");
       }
    }
}