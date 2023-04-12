package br.ufjf.dcc193.debora.exemplo02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class HomeController {

    @Autowired
    private PessoaRepository rep;

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
    public String resultado(Pessoa p){
        rep.save(p);
        return "redirect:/pessoas.html";
    }

    @GetMapping("/pessoas.html")
    public ModelAndView pessoas(){
        ModelAndView mv = new ModelAndView("pessoas");
        List<Pessoa> lista = rep.findAll();
        mv.addObject("pessoas", lista);
        return mv;
    }
}
