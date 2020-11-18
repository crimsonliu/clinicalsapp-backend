package com.tianli.clinicalsapi.restcontrollers;

import com.tianli.clinicalsapi.model.ClinicalData;
import com.tianli.clinicalsapi.model.Patient;
import com.tianli.clinicalsapi.repos.ClinicalDataRepository;
import com.tianli.clinicalsapi.repos.PatientRepository;
import com.tianli.clinicalsapi.restcontrollers.dto.ClinicalDataRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ClinicalDataController {

    @Autowired
    ClinicalDataRepository clinicalDataRepository;

    @Autowired
    PatientRepository patientRepository;

    @PostMapping("/clinicals")
    public ClinicalData saveClinicalData(@RequestBody ClinicalDataRequest clinicalDataRequest){
        Patient patient = patientRepository.findById(clinicalDataRequest.getPatientId()).get();
        ClinicalData data = new ClinicalData();
        data.setComponentName(clinicalDataRequest.getComponentName());
        data.setComponentValue(clinicalDataRequest.getComponentValue());
        data.setPatient(patient);
        return clinicalDataRepository.save(data);
    }


}
