package br.com.homecare.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.homecare.models.entities.PessoaAtendimento;

@Repository
public interface PessoaAtendimentoRepository extends JpaRepository<PessoaAtendimento, Long> {

	@Query("select pesAtend from PessoaAtendimento pesAtend where pesAtend.pessoaId = :id") 
	public List<PessoaAtendimento> findPessoas(@Param("id") Long id);

	@Query("select pesAtend from PessoaAtendimento pesAtend where pesAtend.atendimentoId = :id") 
	public List<PessoaAtendimento> findAtendimentos(@Param("id") Long id);
	
}
