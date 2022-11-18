package tech.devinhouse.meurh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @GetMapping()
    public String getPessoas(){
        return "teste";
    }

    @GetMapping("/{id}")
    public String ByID(@PathVariable("id") String id){
        return id;
    }

}
