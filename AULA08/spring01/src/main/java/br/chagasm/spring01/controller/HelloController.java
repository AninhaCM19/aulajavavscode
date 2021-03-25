package br.chagasm.spring01.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample") //sample = users na url exemplo
public class HelloController { //Controller recebe requisições e devolve respostas no formato texto

    @GetMapping("/hello")
    //public String ola(){ //get padrão de metodo em java (obter dados de um recurso)
      //  return "Olá mundo!";
    public ResponseEntity<String> ola() {
    return ResponseEntity.ok ("Olá mundo"); //ok = 200 = sucesso

    }
    @PostMapping("/hello")
    public String olaPost(){
         //get padrão de metodo em java (obter dados de um recurso)
    return "Olá mundo via Post!";
    }    

    @GetMapping("/positivo/{numero}")
    public ResponseEntity<String> isPositive(@PathVariable int numero){
        if(numero >=0) {
            return ResponseEntity.ok ("É positivo");

        }else {
            return ResponseEntity.ok ("É negativo"); 
        }
    }
}

