package br.ufjf.dcc193.debora.exemplo02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Exemplo02Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Exemplo02Application.class, args);
		PessoaRepository rep = ctx.getBean(PessoaRepository.class);
		rep.save(new Pessoa("Fulano",21));
		rep.save(new Pessoa("Beltrano",22));
		rep.save(new Pessoa("Cliclano", 24));
		System.out.println(rep.findAll());

	}

}
