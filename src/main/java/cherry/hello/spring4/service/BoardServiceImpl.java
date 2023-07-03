package cherry.hello.spring4.service;

import cherry.hello.spring4.dao.BoardDAO;
import cherry.hello.spring4.model.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bsrv")
public class BoardServiceImpl implements BoardService {

    @Autowired BoardDAO bdao;
    @Override
    public List<Board> readBoard(int cpg) {
        int snum = (cpg - 1) * 15;

        return bdao.selectBoard(snum);
    }

    @Override
    public Board readOneBoard(String bno) {
        return bdao.selectOneBoard(bno);
    }

    @Override
    public boolean saveBoard(Board bd) {
        boolean isSaved = false; //boolean 쓸 때 is 붙여야함 변수명만 보고도 불리안인줄 알 수 있게?

        if (bdao.insertBoard(bd) > 0) isSaved = true;

        return isSaved;
    }
}
