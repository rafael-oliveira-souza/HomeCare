package com.homecare.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Table(name = "historico")
public class Historico {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "descricao", nullable = false)
    private String descricao;

//    @Column(name = "data", nullable = false)
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
//    private Date data;

}
