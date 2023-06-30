package cherry.hello.spring4.controller;

import cherry.hello.spring4.service.BoardService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {


    @Autowired    BoardService bsrv;
    private Logger logger = LogManager.getLogger(BoardController.class);

    @GetMapping("/list")
    public String list(Model m, int cpg) {
        logger.info("board/list 호출!!");

        m.addAttribute("boards", bsrv.readBoard(cpg));

        return "board/list.tiles";
    }
    @GetMapping("write")
    public String write() {


        // return "index";  // jsp view resolver
        return "board/write.tiles";
    }
    @GetMapping("view")
    public String view() {


        // return "index";  // jsp view resolver
        return "board/view.tiles";
    }
}


