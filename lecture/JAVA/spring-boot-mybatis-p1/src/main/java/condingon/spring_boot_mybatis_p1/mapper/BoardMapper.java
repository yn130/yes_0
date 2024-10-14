package condingon.spring_boot_mybatis_p1.mapper;

import condingon.spring_boot_mybatis_p1.domain.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

//    List<Board> findAll();
    List<Board> findAllByWriter(String writer);
    List<Board> findAll(Long id);
    Board findById(Long id);
    void insert(Board board);
    void update(Board board);
    void delete(Long id);
}
