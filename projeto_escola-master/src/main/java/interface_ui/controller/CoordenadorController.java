package interface_ui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coordenadores")
public class CoordenadorController {

    Autowired
    private CoordenadorService coordenadorService;

    @PostMapping
    public ResponseEntity <String> salvar (@ResponseBody CoordenadorDto coordenadorDto){
        coordenadorService.salvar(coordenadorDto);
        return ResponseEntity.ok("Coordenador salvo com sucesso");
    }
    @GetMapping
    public ResponseEntity<List<CoordenadorDto>>
}
