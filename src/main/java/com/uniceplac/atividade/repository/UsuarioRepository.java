package com.uniceplac.atividade.repository;

import com.uniceplac.atividade.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    // Consulta derivada: o Spring gera o SQL a partir do nome do método
    boolean existsByEmail(String email);
}
