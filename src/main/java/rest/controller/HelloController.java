package rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import rest.util.BeanUtil;
import rest.util.ConvertUtils;

@Controller
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);

        ConvertUtils convertUtils = BeanUtil.getBean(ConvertUtils.class);
        System.out.println("Byte[]: " + convertUtils.stringToBytes("Phan Thien Quang"));

        return "hello";
    }

}
