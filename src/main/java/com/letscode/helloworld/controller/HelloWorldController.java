package com.letscode.helloworld.controller;

import com.letscode.helloworld.Model.Hello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // responsavel pelo mapeamente de rotas
public class HelloWorldController {

    public int contagem = 0;
    @GetMapping("/hello")
    public String hello(){
        return "Olá Mundo";
    }

    @GetMapping("/v2/hello")
    public String helloV2(@RequestParam(value = "nome", defaultValue = "Escreva seu nome") String nome){
        return "Olá" + nome;
    }
    @GetMapping("/v3/hello")
    public Hello helloV3(@RequestParam(value = "nome", defaultValue = "algo errado")String nome) {
        contagem++;
        return new Hello(contagem,nome);
    }

}
