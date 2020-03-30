package com.homecare.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Table(name = "curriculo")
public class Curriculo {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "descricao")
    private String descricao;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Educacao> educacao;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Experiencia> experiencia;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Idioma> idioma;

    public Curriculo(CurriculoBuilder builder) {
        this.id = builder.id;
        this.descricao = builder.descricao;
        this.nome = builder.nome;
        this.tipo = builder.tipo;
    }

    public static class CurriculoBuilder {
        private Long id;
        private String descricao;
        private String tipo;
        private String nome;

        public CurriculoBuilder setId(Long id) {
            this.id = id;
            return this;
        }

        public CurriculoBuilder setDescricao(String descricao) {
            this.descricao = descricao;
            return this;
        }

        public CurriculoBuilder setTipo(String tipo) {
            this.tipo = tipo;
            return this;
        }

        public CurriculoBuilder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Curriculo build() {
            return new Curriculo(this);
        }

    }
}
