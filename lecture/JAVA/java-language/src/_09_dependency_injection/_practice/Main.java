package _09_dependency_injection._practice;

public class Main {

    public static void main(String[] args) {

        NotificationService processOrder= new EmailNotificationService();
//        NotificationService processOrder = new SMSNotificationService();


        // 1. 생성자 주입
        OrderService service = new OrderService(processOrder);



        // 2. setter
//        OrderService service = new OrderService();
//        service.setNotificationService(processOrder);


        service.send();


    }

}

