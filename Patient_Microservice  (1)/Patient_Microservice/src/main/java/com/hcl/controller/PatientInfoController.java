package com.hcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.hcl.service.PatientInfoService;
import com.hcl.entity.PatientInfo;

@RestController
@RequestMapping("/PatientInfo")
public class PatientInfoController {

	@Autowired
	PatientInfoService patientInfoService;

	@PostMapping("/addDetails")
	public String addPatientDetails(@RequestBody PatientInfo patient) {

		String addStatus = patientInfoService.addPatientDetails(patient);

		return addStatus;
	}
	
	@GetMapping("/findPatientById/{patientId}")
		public PatientInfo getPatientDetails(@PathVariable int patientId) {
		
		PatientInfo patient = patientInfoService.getPatientDetails(patientId);
		
		return patient;
		
		
	}
}
