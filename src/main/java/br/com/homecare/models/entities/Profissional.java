package br.com.homecare.models.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Profissional extends Pessoa {
	private static final long serialVersionUID = 1L;

    @OneToMany(mappedBy = "profissional")
    private List<Profissao> profissoes;

    @OneToOne(cascade = CascadeType.ALL, mappedBy="profissional")
    private Curriculo curriculo;

}
