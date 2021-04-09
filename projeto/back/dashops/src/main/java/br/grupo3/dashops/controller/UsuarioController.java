package br.grupo3.dashops.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.grupo3.dashops.model.Usuario;
import br.grupo3.dashops.repository.UsuarioRepo;

@RestController
@CrossOrigin("*")
@RequestMapping("/usuarios")

public class UsuarioController {
    
    @Autowired
    private UsuarioRepo repo;

    @PostMapping("/login")
    public ResponseEntity<Usuario> login(@RequestBody Usuario userEnviado){
        Usuario userDoDB = repo.findByEmailOrRacf(userEnviado.getEmail(), userEnviado.getRacf());

        if(userDoDB != null){
            if(userDoBD.getSenha().equals(userEnviado.getSenha())){
                return ResponseEntity.ok(userDoBD);
            }


        }
        return ResponseEntity.notFound().build()

    }
    
}
