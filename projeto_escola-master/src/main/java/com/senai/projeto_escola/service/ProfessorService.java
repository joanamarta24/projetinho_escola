package com.senai.projeto_escola.service;

import com.senai.projeto_escola.application.dto.ProfessorDto;
import com.senai.projeto_escola.domain.entity.Professor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {
    @Autowired
    private ProfessorService professorRpo;

    public void salvar(ProfessorDto professorDto){
        Professor professor = new Professor();
        professor.setNome(professorDto.nome());
        professor.setIdade(professorDto.idade());
        professor.setUnidadesCurriculares(mapUnidadedCurriculares(professorDto.unidadesCurriculares()));
        professorRpo.salvar(professor);
    }
    private List<Professor>
}
