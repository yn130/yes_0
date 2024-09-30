package _05_class._practice._03;

public abstract class Student2 {
    String name;
    String school;
    int age;
    int student_ID;


    public  Student2(String name, String school, int age, int student_ID){
        this.name = name;
        this.school = school;
        this.age = age;
        this.student_ID = student_ID;
    }

    abstract void todo();

    public void displayInfo() {
        System.out.println("=== " + name + " 학생의 정보 ===");
        System.out.println("학교: " + school);
        System.out.println("나이: " + age);
        System.out.println("학번: " + student_ID);
    }

}
