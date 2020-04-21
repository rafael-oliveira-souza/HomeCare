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
@Table(name = "paciente_medicamento")
public class PacienteMedicamento {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "paciente_id", nullable = false)
    private Long paciente;

    @Column(name = "medicamento_id", nullable = false)
    private Long medicamento;
}
