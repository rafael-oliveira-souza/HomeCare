package br.com.homecare.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.homecare.models.entities.Atendimento;

@Repository
public interface AtendimentoRepository extends JpaRepository<Atendimento, Long> {

	@Query("select atend from Atendimento atend where atend.profissionalId = :id or atend.pacienteId = :id")
	public List<Atendimento> findAtendimentoByIdPessoa(@Param("id") Long id);
}
