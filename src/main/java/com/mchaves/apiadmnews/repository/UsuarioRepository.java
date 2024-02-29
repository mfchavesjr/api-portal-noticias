package com.mchaves.apiadmnews.repository;

import com.mchaves.apiadmnews.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}