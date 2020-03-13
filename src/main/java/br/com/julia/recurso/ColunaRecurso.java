package br.com.julia.recurso;

import br.com.julia.dominio.Coluna;
import br.com.julia.service.ColunaServico;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "rampup/coluna")
public class ColunaRecurso {
    private final Logger log = LoggerFactory.getLogger(ColunaRecurso.class);

    @Autowired
    private ColunaServico colunaServico;
    @PostMapping
    public ResponseEntity<Coluna> save(@RequestBody Coluna coluna) {
        log.debug("REST para salvar o coluna : {}", coluna);
        Coluna response;
        try {
            response = this.colunaServico.salvar(coluna);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
    @GetMapping
    //Trazer todas as colunas adicionadas no bd
    public ResponseEntity<List<Coluna>> findAll() {
        log.debug("REST listar todos as colunas");
        List<Coluna> response;
        try {
            response = this.colunaServico.listarPorId();
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
