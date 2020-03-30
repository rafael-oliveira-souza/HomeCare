package com.homecare.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Table(name = "paciente_historico")
public class PacienteHistorico {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

//    @Column(name = "paciente_id", nullable = false)
    @JoinColumn(name = "paciente_id",nullable = false, foreignKey = @ForeignKey(name = "fk_pac_hist_pac"))
    private Long paciente;

//    @Column(name = "historico_id", nullable = false)
    @JoinColumn(name = "historico_id",nullable = false, foreignKey = @ForeignKey(name = "fk_pac_hist_hist"))
    private Long historico;
}
