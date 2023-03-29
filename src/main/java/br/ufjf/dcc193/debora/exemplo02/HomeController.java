package br.ufjf.dcc193.debora.exemplo02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
        return "home";
    }

    @GetMapping("/formulario.html")
    public String formulario(){
        return "form";
    }

    @PostMapping("/resultado.html")
    public ModelAndView resultado(String nome, Integer idade){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("form-resp");
        mv.addObject("nome", nome);
        mv.addObject("idade", idade);
        return mv;
    }
}
