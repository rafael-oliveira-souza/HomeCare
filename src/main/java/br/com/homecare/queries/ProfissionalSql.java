package br.com.homecare.queries;

public class ProfissionalSql {
	public static final String RELACAO_PROFISSIONAL_ESPECIALIDADE_SINTOMA = 
			"select profissao.nome, espec, sint from Profissional prof " +
			"inner join prof.profissoes profissao " + 
			"inner join profissao.especialidades espec " + 
			"inner join espec.sintomas sint " + 
			"where prof.id = :idProfissional";
//	
	public static final String RELACAO_PROFISSIONAL_SINTOMA2 = 
			"select " + 
			"	pes, profissao.nome as nome_profissao, profissao.descricao as descricao_profissao " + 
			"from Profissional prof " + 
			"inner join Pessoa as pes on prof.id = pes.id " + 
			"inner join Profissional_profissao as prof_prof on  prof_prof.profissional_id = prof.id " + 
			"inner join Profissao as profissao on  profissao.id = prof_prof.profissao_id " + 
			"inner join Especialidade as espec on espec.profissao_id = prof_prof.profissao_id " + 
			"inner join Sintoma_especialidade as sint_espec on sint_espec.especialidade_id = espec.id " + 
			"inner join Sintoma as sint on sint.id = sint_espec.sintoma_id " + 
			"where prof.idProfissional = :idProfissional";

}
