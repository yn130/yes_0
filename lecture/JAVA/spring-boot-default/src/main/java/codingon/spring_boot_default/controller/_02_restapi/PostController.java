package codingon.spring_boot_default.controller._02_restapi;


import codingon.spring_boot_default.vo.PracVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PostController {
    @GetMapping("/")
    public String getReq() { return "_02_restapi/post_req"; }



    @PostMapping("/post/prac1")
    public String postPrac1(
            @RequestParam("name") String name,
            @RequestParam("gender") String gender,
            @RequestParam("year") String year,
            @RequestParam("month") String month,
            @RequestParam("day") String day,
            @RequestParam("interest") List<String> interests,
            Model model) {

        String birthDate = year + "-" + month + "-" + day;


        model.addAttribute("name", name);
        model.addAttribute("gender", gender);
        model.addAttribute("birthDate", birthDate);
        model.addAttribute("interests", String.join(",", interests));


        return "_02_restapi/post_res";
    }


    @PostMapping("/axios/vo/post/prac2")
    @ResponseBody
    public String postPrac2(@RequestBody PracVO pracVO) {

        System.out.println("[POST] axios and vo (name) = " + pracVO.getName());
        System.out.println("[POST] axios and vo (gender) = " + pracVO.getGender());
        System.out.println("[POST] axios and vo (year) = " + pracVO.getYear());
        System.out.println("[POST] axios and vo (month) = " + pracVO.getMonth());
        System.out.println("[POST] axios and vo (day) = " + pracVO.getDay());
        System.out.println("[POST] axios and vo (interest) = " + pracVO.getInterest());

        return pracVO.getName() +"회원가입 성공";

    }
}
