package codingon.spring_boot_default.controller._01_thymeleaf;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Prac02Controller {

    @GetMapping("/people")
    public String getPeople(Model model) {
        // Person 객체 4명 생성
        List<Prac02Controller.Person> people = new ArrayList<>();
        people.add(new Prac02Controller.Person("Kim", 10));
        people.add(new Prac02Controller.Person("Lee", 20));
        people.add(new Prac02Controller.Person("Hong", 30));
        people.add(new Prac02Controller.Person("Park", 40));
        people.add(new Prac02Controller.Person("Shin", 50));

        model.addAttribute("people", people);

        return "_01_thymeleaf/practice02";
    }


    public class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
