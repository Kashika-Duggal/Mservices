package com.hcl.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.repository.PatientInfoRepository;
import com.hcl.entity.PatientInfo;

@Service
public class PatientInfoService {

	@Autowired
	PatientInfoRepository patientInfoRepository;
	
	public String addPatientDetails(PatientInfo patient) {
		patientInfoRepository.save(patient);
		
		return "Patient details added Successfully";
		
	}

	public PatientInfo getPatientDetails(int patientId) {
		
		PatientInfo patientInfo = patientInfoRepository.findByPatientId(patientId);
		
		return patientInfo;
		
	}
}
