package br.com.homecare.queries;

public class ProfissionalSql {
	public static final String RELACAO_PROFISSIONAL_ESPECIALIDADE_SINTOMA = 
			"select profissao.nome, espec, sint from Profissional prof " +
			"inner join prof.profissoes profissao " + 
			"inner join profissao.especialidades espec " + 
			"inner join espec.sintomas sint " + 
			"where prof.id = :idProfissional";

}
