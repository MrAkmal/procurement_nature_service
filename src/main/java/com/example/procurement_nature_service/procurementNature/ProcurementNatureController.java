package com.example.procurement_nature_service.procurementNature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProcurementNatureController {


    private final ProcurementNatureService service;

    @Autowired
    public ProcurementNatureController(ProcurementNatureService service) {
        this.service = service;
    }


    @PostMapping
    public ResponseEntity<Integer> create(@RequestBody ProcurementNature procurementNature) {
        Integer id = service.save(procurementNature);

        return new ResponseEntity<>(id, HttpStatus.OK);
    }


    @PutMapping()
    public ResponseEntity<Integer> update(@RequestBody ProcurementNature procurementNature) {

        Integer id = service.update(procurementNature);

        return new ResponseEntity<>(id, HttpStatus.OK);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Integer> delete(@PathVariable("id") int deletedId) {

        Integer id = service.delete(deletedId);

        return new ResponseEntity<>(id, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProcurementNature> get(@PathVariable("id") int id) {

        ProcurementNature procurementNature = service.get(id);
        return new ResponseEntity<>(procurementNature, HttpStatus.OK);

    }

    @GetMapping
    public ResponseEntity<List<ProcurementNature>> getAll() {

        List<ProcurementNature> procurementNatures = service.getAll();

        return new ResponseEntity<>(procurementNatures, HttpStatus.OK);
    }


}
