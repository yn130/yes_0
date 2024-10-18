package codingon.spring_boot_jpa.service;


import codingon.spring_boot_jpa.dto.BoardDTO;
import codingon.spring_boot_jpa.entity.Board;
import codingon.spring_boot_jpa.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;


    public List<BoardDTO> getAllBoards() {

        List<Board> boards = boardRepository.findAll();

        List<BoardDTO> boardDTOs = new ArrayList<>();

        for (Board board : boards) {
            BoardDTO boardDTO = convertToDto(board);
            boardDTOs.add(boardDTO);
        }
        return boardDTOs;
    }


    public BoardDTO getUserById(Long id) {
        Board board = boardRepository.findById(id).orElse(null);

        if (board == null) {
            throw new RuntimeException("Board not found");
        }

        return convertToDto(board);
    }

//    private BoardDTO convertToDto(Board board) {
//        // builder 패턴을 이용해 dto 객체 생성
//        return BoardDTO.builder()
//                .no((int) (board.getId() + 100))
//                .title(board.getTitle())
//                .content(board.getContent())
//                .writer(board.getWriter())
//                .registered(String.valueOf(board.getRegistered()))
//                .build();
//    }
private BoardDTO convertToDto(Board board) {

    return BoardDTO.builder()
            .no((int) (board.getId() + 100))
            .title(board.getTitle())
            .content(board.getContent())
            .writer(board.getWriter())
            .registered(String.valueOf(board.getRegistered()))
            .build();
}


}
