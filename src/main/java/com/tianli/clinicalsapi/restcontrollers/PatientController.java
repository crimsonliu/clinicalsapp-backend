package com.tianli.clinicalsapi.restcontrollers;

import com.tianli.clinicalsapi.model.Patient;
import com.tianli.clinicalsapi.repos.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class PatientController {

    @Autowired
    PatientRepository patientRepository;

    @PostMapping("/addPatient")
    public Patient savePatient(@RequestBody Patient patient){
        return patientRepository.save(patient);
    }

    public Patient getPatient(@PathVariable("id") int id){
        return patientRepository.findById(id).get();
    }

    public List<Patient> getPatients(){
        return patientRepository.findAll();
    }

}
