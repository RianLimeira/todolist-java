package br.com.rianlimeira.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class MinhaController {

    /**
     * MÉTODOS HTTP
     * GET - BUSCAR
     * POST - ADICIONAR
     * PUT - ALTERAR DADOS
     * DELETE - DELETAR/REMOVER
     * PATCH - AÇTERAR SOMENTE UM DADO
     */

    // Método (Funcionalidade) de uma classe
    @GetMapping({"", "/"})
    public String primeiraMensagem(){
        return "Funcionou";
    }
}
