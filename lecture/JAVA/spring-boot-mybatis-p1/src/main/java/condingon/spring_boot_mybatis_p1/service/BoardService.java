package condingon.spring_boot_mybatis_p1.service;


import condingon.spring_boot_mybatis_p1.domain.Board;
import condingon.spring_boot_mybatis_p1.dto.BoardDTO;
import condingon.spring_boot_mybatis_p1.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardMapper boardMapper;

//    public List<BoardDTO> getAllBoards() {
//
//        List<Board> boards = boardMapper.findAll();
//        List<BoardDTO> boardDTOs = new ArrayList<>();
//
//        for (Board board : boards){
//            BoardDTO boardDTO = convertToDto(board);
//            boardDTOs.add(boardDTO);
//        }
//        return boardDTOs;
//    }

    public List<BoardDTO> getAllBoardsByWriter(String writer) {
        List<Board> boards = boardMapper.findAllByWriter(writer);
        List<BoardDTO> boardDTOs = new ArrayList<>();

        for (Board board : boards) {
            BoardDTO boardDTO = convertToDto(board);
            boardDTOs.add(boardDTO);
        }
        return boardDTOs;
    }

    public BoardDTO getBoardById(Long id) {
        Board board = boardMapper.findById(id);
        return convertToDto(board);
    }

    // 새 새용자 생성
    public void createBoard(BoardDTO boardDTO) {
        Board board = convertToEntity(boardDTO);
        boardMapper.insert(board);
    }


    // 시용자 정보 업데이트
//    public void updateBoard(BoardDTO boardDTO) {
//        Board board = convertToEntity(boardDTO);
//        boardMapper.update(board);
//    }
    public void updateBoard(BoardDTO boardDTO) {
        Board board = convertToEntity(boardDTO);
        boardMapper.update(board);  // 매퍼를 통해 업데이트 처리
    }

    // 특정 ID의 사용자 삭제
    public void deleteBoard(Long id) {
        boardMapper.delete(id);
    }



    // dto to domain
    private Board convertToEntity(BoardDTO dto) {
        Board board = new Board();
        board.setId(dto.getId());
        board.setTitle(dto.getTitle());
        board.setContent(dto.getContent());
        board.setWriter(dto.getWriter());
        board.setRegistered(dto.getRegistered());

        return board;
    }

    private BoardDTO convertToDto(Board board) {
        BoardDTO dto = new BoardDTO();
        dto.setId(board.getId());
        dto.setTitle(board.getTitle());
        dto.setContent(board.getContent());
        dto.setWriter(board.getWriter());
        dto.setRegistered(board.getRegistered());
        dto.setNo((int) (board.getId() + 100));

        return dto;
    }

}
