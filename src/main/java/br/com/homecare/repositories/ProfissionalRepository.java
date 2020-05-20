package br.com.homecare.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.homecare.models.entities.Profissional;
import br.com.homecare.queries.ProfissionalSql;

@Repository
public interface ProfissionalRepository extends JpaRepository<Profissional, Long> {
	
	@Query(ProfissionalSql.RELACAO_PROFISSIONAL_ESPECIALIDADE_SINTOMA) 
	public List<Profissional> buscarProfissionalEspecialidadeSintoma(@Param("idProfissional") Long idProfissional);

}
