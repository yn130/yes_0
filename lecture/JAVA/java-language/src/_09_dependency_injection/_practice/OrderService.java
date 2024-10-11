package _09_dependency_injection._practice;

public class OrderService {
    //1. 생성자 주입
    private final NotificationService processOrder;

    public OrderService(NotificationService processOrder){
        this.processOrder =processOrder;
    }

    public void send(){
        processOrder.send();
    }



    //2. setter
//    private NotificationService processOrder;
//
//    public void setNotificationService(NotificationService processOrder){
//        this.processOrder = processOrder;
//    }
//
//    public void send(){
//        processOrder.send();
//    }


}
