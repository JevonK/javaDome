package com.example.demo.Controllers;


import com.example.demo.entity.School;
import com.example.demo.service.SchoolService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;


@Controller
public class IndexController {

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private SchoolService schoolService;

    @GetMapping("/")
    public String index(Model model) {
        logger.info("从数据库读取Student集合");
        List<School> list = schoolService.getSchoolList();
        model.addAttribute("list", list);
        return "hello";
    }
    @RequestMapping("/hello")
    public String test() {
        System.out.print("hello");
        return "hello";
    }
}
