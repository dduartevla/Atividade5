package br.ufjf.dcc193.debora.exemplo02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping({"/","/index.html"})
    @ResponseBody
    public String index(){
        return "Hello, wolrd!";
    }
}
