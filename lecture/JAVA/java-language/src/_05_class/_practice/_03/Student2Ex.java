package _05_class._practice._03;

public class Student2Ex {
    public static void main(String[] args) {
        Kim kim = new Kim("김철수", "ABC 고등학교", 17, 20220001);
        Baek baek = new Baek("백영희", "egw 고등학교", 14, 20240001);

        go(kim);
        System.out.println();
        go(baek);
    }

    public static void go(Student2 student2){
        student2.displayInfo();
        student2.todo();
    }
}







