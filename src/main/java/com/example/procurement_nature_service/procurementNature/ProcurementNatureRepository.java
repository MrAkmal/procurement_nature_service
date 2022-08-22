package com.example.procurement_nature_service.procurementNature;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcurementNatureRepository extends R2dbcRepository<ProcurementNature, Integer> {
}
