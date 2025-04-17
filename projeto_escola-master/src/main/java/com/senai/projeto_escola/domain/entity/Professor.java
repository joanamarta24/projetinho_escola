package com.senai.projeto_escola.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "professores")
@Data
public class Professor extends Usuario{

    @Column(nullable = false)
    private String turma;

    @CollectionTable(name = "uc_professores", joinColumns = @JoinColumn(name = "professor_id"))
    @ElementCollection(targetClass = UnidadesCurriculares.class)
    @Enumerated(EnumType.STRING)
    @Column(name = "unidades_curriculares")
    private List<UnidadesCurriculares> unidadesCurriculares;

    public void setUnidadeCurriculares(List<UnidadesCurriculares> unidadesCurriculares) {

    }
}
