package br.ufjf.dcc193.debora.exemplo02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class HomeController {

    @GetMapping({"/","/index.html"})
    public String index(HttpServletRequest req, HttpServletResponse resp){
        //String nome = req.getParameter("nome");
        //if (nome == null){
        //    nome = "Desconhecido";
        //}
        return "/WEB-INF/views/home.jsp";
    }
}
