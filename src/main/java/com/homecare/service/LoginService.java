package com.homecare.service;

import com.homecare.service.auth.AuthService;
import com.homecare.model.entity.Usuario;
import com.homecare.repository.LoginRepository;

import javax.inject.Inject;

public class LoginService extends LoginRepository {
    @Inject
    private AuthService authService;

    public Usuario save(Usuario usuario) {
        Usuario novoUsuario = super.save(usuario);

        String token = this.authService.gerarToken();
        this.authService.validarToken(token);

        return  novoUsuario;
    }

    public Usuario update(Usuario usuario) {
        return  super.update(usuario);
    }

    public void delete(Long id) {
        super.delete(id);
    }
}
