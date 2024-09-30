package _05_class._practice._03;

public class Kim extends Student2{

    public Kim(String name, String school, int age, int student_ID) {
        super(name, school, age, student_ID);
    }

    @Override
    void todo(){
        System.out.println("점심은 김가네 김밥");
    }

}


