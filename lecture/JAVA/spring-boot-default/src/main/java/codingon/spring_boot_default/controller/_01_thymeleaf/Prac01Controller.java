package codingon.spring_boot_default.controller._01_thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Prac01Controller {

    @GetMapping("/getAge")
    public String getAge(Model model) {
        Hello hello = new Hello(24); // Creating Hello object
        model.addAttribute("classHello", hello); // Adding object to the model
        return "_01_thymeleaf/practice01";
    }

    class Hello {
        private int age;

        public Hello(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }
    }
}


