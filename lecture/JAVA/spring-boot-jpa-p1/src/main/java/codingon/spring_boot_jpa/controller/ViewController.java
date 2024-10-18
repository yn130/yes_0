package codingon.spring_boot_jpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// 템플릿 엔진을 렌더링하는 코드들
@Controller
public class ViewController {


    @GetMapping("/boards")
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