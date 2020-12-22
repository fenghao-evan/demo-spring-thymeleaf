package cn.falsehero.demospringthymeleaf.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: fenghao
 * @Date: 2020/12/06 21:11
 * @Description:
 */
@Controller
public class DemoController {

    @RequestMapping("/demo")
    public String demo(Model model) {
        model.addAttribute("demo", "this is a demo project");
        return "demo";
    }

}
