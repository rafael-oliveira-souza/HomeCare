package br.com.homecare.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.homecare.models.entities.Curriculo;

@Repository
public interface CurriculoRepository extends JpaRepository<Curriculo, Long> {

}
