package _09_dependency_injection._practice;

public class EmailNotificationService implements NotificationService {
    public void send(){
        System.out.println("Order processed successfully ");
        System.out.println("Sending email notification: Your order has been processed ");
        System.out.println(" --- ");
    }
}
