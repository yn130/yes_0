package condingon.spring_boot_mybatis_p1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {


//    @GetMapping("/boards")
//    public String listBoards() {
//        return "board";
//    }

    @GetMapping("/boards/{writer}")
    public String listBoards() {
        return "board";
    }

    @GetMapping("/boards/new")
    public String newBoardForm() {
        return "boardForm";
    }

    // GET /users/{id}/new 요청시 userForm.html 템플릿 뷰 반환 ("기존 유저 정보 수정")
    @GetMapping("/boards/{id}/edit")
    public String editBoardForm() {
        return "boardForm";
    }

}
