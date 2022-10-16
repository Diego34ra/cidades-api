package cidadesapi.controller;

import cidadesapi.model.Pais;
import cidadesapi.repository.PaisRepository;
import cidadesapi.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;
import java.util.List;

@RestController
@RequestMapping("/paises")
public class PaisController {

    @Autowired
    private PaisService paisService;

    @Autowired
    private PaisRepository paisRepository;

    @GetMapping
    public List<Pais> findAll() {
        return paisService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pais> findById(@PathVariable Integer id) {
        Pais pais = paisService.findById(id);
        return ResponseEntity.ok(pais);
    }

//
//    @GetMapping
//    public Page<Pais> findPais(Pageable pageable) {
//        return paisRepository.findAll(pageable);
//    }
}
