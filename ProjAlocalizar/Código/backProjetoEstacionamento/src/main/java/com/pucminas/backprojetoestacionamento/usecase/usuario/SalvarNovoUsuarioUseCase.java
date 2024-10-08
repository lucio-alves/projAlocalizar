package com.pucminas.backprojetoestacionamento.usecase.usuario;


import com.pucminas.backprojetoestacionamento.common.mapper.Mapper;
import com.pucminas.backprojetoestacionamento.core.usuario.UsuarioService;
import com.pucminas.backprojetoestacionamento.entrypoint.usuario.dto.UsuarioDTO;
import com.pucminas.backprojetoestacionamento.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SalvarNovoUsuarioUseCase {
    @Autowired
    UsuarioService usuarioService;

    @Autowired
    Mapper mapper;

    public Usuario salvarNovoUsuario(Usuario usuario) {
        return usuarioService.salvarUsuario(usuario);
    }

}
