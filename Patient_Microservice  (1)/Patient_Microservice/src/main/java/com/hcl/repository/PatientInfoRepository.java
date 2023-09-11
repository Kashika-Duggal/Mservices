package com.hcl.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hcl.entity.PatientInfo;


@Repository
@RequestMapping("/PatientInfo")
public interface PatientInfoRepository extends CrudRepository<PatientInfo, String> {

	PatientInfo findByPatientId(int patientId);

}
