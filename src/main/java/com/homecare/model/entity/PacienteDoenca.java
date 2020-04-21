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
@Table(name = "paciente_doenca")
public class PacienteDoenca {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "paciente_id", nullable = false)
    private Long paciente;

    @Column(name = "doenca_id", nullable = false)
    private Long doenca;
}
