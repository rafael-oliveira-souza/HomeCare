package br.com.homecare.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.homecare.models.entities.Usuario;

@Repository
public interface LoginRepository extends JpaRepository<Usuario, Long> {

}
