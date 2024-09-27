package _05_class._practice;

import java.util.ArrayList;
import java.util.List;

public class StudentEx {

    public static void main(String[] args) {

        List<Student> std = new ArrayList<>();

        Student s1 = new Student("김새싹", 20231001, 1);
        Student s2 = new Student("박지은", 20231002, 2);
        Student s3 = new Student("이은지", 20231002, 3);

        std.add(s1);
        std.add(s2);
        std.add(s3);

        for (Student s : std){
            s.studentInfo();
            System.out.println();
        }

        System.out.println("총 학생 수는 " + Student.getTotalStudents() + "명 입니다.");


    }

}
