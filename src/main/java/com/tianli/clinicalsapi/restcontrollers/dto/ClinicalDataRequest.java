package com.tianli.clinicalsapi.restcontrollers.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ClinicalDataRequest {

    private String componentName;
    private String componentValue;
    private int patientId;

}
