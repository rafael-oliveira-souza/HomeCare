package com.homecare.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Table(name = "paciente")
public class Paciente implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false, foreignKey = @ForeignKey(name = "fk_pac_pes"))
    private Pessoa pessoa;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="paciente_id")
    private List<Doenca> doencas;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="paciente_id")
    private List<Medicamento> medicamentos;

}
