package condingon.spring_boot_mybatis_p1.controller;

import condingon.spring_boot_mybatis_p1.dto.BoardDTO;
import condingon.spring_boot_mybatis_p1.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/boards")
public class BoardController {

    @Autowired
    private BoardService boardService;

//    @GetMapping
//    public List<BoardDTO> listBoards() {
//        return boardService.getAllBoards();
//    }

    // 특정 작성자의 글 조회
    @GetMapping
    public List<BoardDTO> listBoardsByWriter(@RequestParam String writer) {
        return boardService.getAllBoardsByWriter(writer);
    }

    // 특정 ID 의 사용자 정보 반환
    @GetMapping("/{id}")
    public BoardDTO getBoard(@PathVariable Long id) {
        return boardService.getBoardById(id);
    }

    // 새 사용자를 생성하고 생성된 사용자 정보 반환
    @PostMapping
    public BoardDTO createBoard(@RequestBody BoardDTO boardDTO) {
        boardService.createBoard(boardDTO);
        return boardDTO;
    }

    // 특정 ID 의 사용자 정보를 업데이트하고 업데이트된 정보를 반환
    @PutMapping("/{id}")
    public BoardDTO updateBoard(@PathVariable Long id, @RequestBody BoardDTO boardDTO) {
        boardDTO.setId(id);
        boardService.updateBoard(boardDTO);
        return boardDTO;
    }

    // 특정 ID 의 사용자 삭제
    @DeleteMapping("/{id}")
    public void deleteBoard(@PathVariable Long id) {
        boardService.deleteBoard(id);
    }

}




