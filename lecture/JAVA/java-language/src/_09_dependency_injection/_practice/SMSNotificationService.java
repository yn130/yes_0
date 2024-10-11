package _09_dependency_injection._practice;

public class SMSNotificationService implements NotificationService{
    public void send(){
        System.out.println("Order processed successfully ");
        System.out.println("Sending SMS notification: Your order has been processed ");

    }
}
