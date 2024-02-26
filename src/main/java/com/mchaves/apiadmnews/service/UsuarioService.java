package com.mchaves.apiadmnews.service;

import com.mchaves.apiadmnews.entity.Usuario;
import com.mchaves.apiadmnews.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Transactional(readOnly = true)
    public List<Usuario> buscarTodos() {
        return usuarioRepository.findAll();
    }

    @Transactional
    public Usuario salvar(Usuario usuario) {
        return  usuarioRepository.save(usuario);
    }
}
