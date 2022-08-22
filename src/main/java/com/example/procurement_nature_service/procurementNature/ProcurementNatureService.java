package com.example.procurement_nature_service.procurementNature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProcurementNatureService {


    private final ProcurementNatureRepository repository;


    @Autowired
    public ProcurementNatureService(ProcurementNatureRepository repository) {
        this.repository = repository;
    }


    public Mono<ProcurementNature> save(ProcurementNature procurementNature) {

        Mono<ProcurementNature> save = repository.save(procurementNature);
        return save;
    }

    public Mono<ProcurementNature> update(ProcurementNature procurementNature) {
        Mono<ProcurementNature> save = repository.save(procurementNature);
        return save;
    }

    public Mono<Void> delete(Integer deletedId) {
        Mono<Void> voidMono = repository.deleteById(deletedId);
        return voidMono;
    }

    public Mono<ProcurementNature> get(int id) {

        Mono<ProcurementNature> mono = repository.findById(id);

        return mono;
    }

    public Flux<ProcurementNature> getAll() {

        Flux<ProcurementNature> all = repository.findAll();

        System.out.println("all = " + all);

        return all;
    }
}
