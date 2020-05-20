package br.com.homecare.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.homecare.models.entities.Profissional;

@Repository
public interface ProfissionalRepository extends JpaRepository<Profissional, Long> {
	
//	@Query("Select *FROM PROFISSIONAL WHERE") 
//	public List<Profissional> buscarProfissionaisRelacionadosSintomas();

}
