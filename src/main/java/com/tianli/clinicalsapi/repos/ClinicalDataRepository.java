package com.tianli.clinicalsapi.repos;

import com.tianli.clinicalsapi.model.ClinicalData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClinicalDataRepository extends JpaRepository<ClinicalData, Integer> {
    List<ClinicalData> findByPatientAndComponentNameOrderByMeasuredDateTime(int patientId, String componentName);
}
