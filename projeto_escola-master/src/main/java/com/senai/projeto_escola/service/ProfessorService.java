package com.senai.projeto_escola.service;

import com.senai.projeto_escola.application.dto.CoordenadorDto;
import com.senai.projeto_escola.application.dto.ProfessorDto;
import com.senai.projeto_escola.domain.entity.Professor;
import org.apache.el.stream.Optional;
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
        professor.setUnidadesCurriculares(professorDto.unidadesCurriculares());
        professorRpo.salvar(professor);
    }
    public List<CoordenadorDto> listar(){
        return professorRpo.findAll().stream().map(p-> new ProfessorDto(
                p.getId(),
                p.getNome(),
                p.getIdade(),
                p.getUnidadesCurriculares()
        )).toList();
    }
    public Optional<ProfessorDto>buscarPorId(Long id)

}
