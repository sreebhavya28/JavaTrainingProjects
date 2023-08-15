package com.doctor.service;

import java.util.List;

import com.doctor.exceptions.DoctorNotFoundException;
import com.doctor.model.Doctor;

public interface IDoctorService {
	
	//void addDoctorsFromFile(String filename);
	 void addDoctor (Doctor doctor);

	
	

	 int updateDoctor (int doctorId, double fees);
	 Doctor getById(int doctorId);

	 void deleteDoctor (int doctorId);
	 List getAllDoctors();

	

	 List getBySpeciality (String speciality) throws DoctorNotFoundException;
	 List getBySpecialityAndExp(String speciality, int experience) throws DoctorNotFoundException;
	 List getBySpecialityAndfees (String speciality, double fees) throws DoctorNotFoundException;

	
}
