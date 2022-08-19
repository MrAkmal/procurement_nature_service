package com.example.procurement_nature_service.procurementNature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProcurementNatureService {


    private final ProcurementNatureRepository repository;


    @Autowired
    public ProcurementNatureService(ProcurementNatureRepository repository) {
        this.repository = repository;
    }


    public Integer save(ProcurementNature procurementNature) {

        ProcurementNature nature = repository.save(procurementNature);
        return nature.getId();
    }

    public Integer update(ProcurementNature procurementNature) {

        Optional<ProcurementNature> optional = repository.findById(procurementNature.getId());

        if (optional.isEmpty())
            throw new RuntimeException("ProcurementNature not found by id - " + procurementNature.getId());

        ProcurementNature nature = repository.save(procurementNature);
        return nature.getId();
    }

    public Integer delete(int deletedId) {
        repository.deleteById(deletedId);
        return deletedId;
    }

    public ProcurementNature get(int id) {

        Optional<ProcurementNature> optional = repository.findById(id);

        if (optional.isEmpty()) throw new RuntimeException("ProcurementNature not found by id - " + id);

        return optional.get();
    }

    public List<ProcurementNature> getAll() {

        List<ProcurementNature> natures = repository.findAll();

        if (natures.isEmpty()) throw new RuntimeException("ProcurementNatures not found");

        return natures;
    }
}
