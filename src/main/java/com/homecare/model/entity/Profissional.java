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
@Table(name = "profissional")
public class Profissional {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false, foreignKey = @ForeignKey(name = "fk_prof_pes"))
    private Pessoa pessoa;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="profissional_id")
    private List<Profissao> profissoes;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false, foreignKey = @ForeignKey(name = "fk_prof_cur"))
    private Curriculo curriculo;

}
