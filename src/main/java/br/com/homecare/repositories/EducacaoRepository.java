package br.com.homecare.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.homecare.models.entities.Educacao;

@Repository
public interface EducacaoRepository extends JpaRepository<Educacao, Long> {

}
