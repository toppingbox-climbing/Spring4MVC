package cherry.hello.spring4.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

    private Logger logger = LogManager.getLogger(BoardController.class);

    @GetMapping("/list")
    public String list(Model m) {
       // return "index";  // jsp view resolver
        return "board/list.tiles";
    }
    @GetMapping("write")
    public String write(Model m) {


        // return "index";  // jsp view resolver
        return "board/write.tiles";
    }
    @GetMapping("view")
    public String view(Model m) {


        // return "index";  // jsp view resolver
        return "board/view.tiles";
    }
}


