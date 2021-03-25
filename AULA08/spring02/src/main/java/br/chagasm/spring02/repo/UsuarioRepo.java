package br.chagasm.spring02.repo;

import org.springframework.data.repository.CrudRepository;

import br.chagasm.spring02.model.Usuario;

    public interface UsuarioRepo extends CrudRepository <Usuario, Integer>{
        public Usuario findByEmailAndSenha(String email, String senha);
    }


