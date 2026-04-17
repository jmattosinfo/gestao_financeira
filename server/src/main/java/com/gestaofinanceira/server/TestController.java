package com.gestaofinanceira.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//classe de teste para verificar se o servidor está funcionando corretamente
public class TestController {
    @GetMapping("/api/status") //faz uma requisição GET para o endpoint /api/status
    public String checkStatus() { //declara uma função que retorna uma string.
        return "OK";
    }
}
