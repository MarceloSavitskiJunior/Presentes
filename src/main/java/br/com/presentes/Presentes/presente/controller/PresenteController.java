package br.com.presentes.Presentes.presente.controller;

import br.com.presentes.Presentes.presente.model.Presente;
import br.com.presentes.Presentes.presente.repository.PresenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/presente")
public class PresenteController {

    @Autowired
    private final PresenteRepository presenteRepository;

    public PresenteController(PresenteRepository presenteRepository) {
        this.presenteRepository = presenteRepository;
    }

    @GetMapping("/get-presente")
    public Presente getPresenteById(@RequestParam("id") Long id) {
        return presenteRepository.getReferenceById(id);
    }

    @GetMapping("/get-all-presentes")
    public List<Presente> getAllPresentes() {
        return presenteRepository.findAll();
    }

    @PostMapping("/save-presente")
    public ResponseEntity<Presente> savePresente(@RequestBody Presente presente) {
        return ResponseEntity.ok(presenteRepository.save(presente));
    }

    @PutMapping("/update-presente")
    public ResponseEntity<Presente> updatePresente(@RequestBody Presente presente) {
        return ResponseEntity.ok(presenteRepository.save(presente));
    }

    @DeleteMapping("/delete-presente")
    public void deletePresente(@RequestParam("id") Long id) {
        presenteRepository.deleteById(id);
    }

}
