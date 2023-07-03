package cherry.hello.spring4.dao;

import cherry.hello.spring4.model.Board;

import java.util.List;

public interface BoardDAO {
    List<Board> selectBoard(int snum);
    Board selectOneBoard(String bno);
}
