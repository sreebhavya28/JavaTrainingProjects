package com.doctor.dao;

import java.util.List;

import com.doctor.exceptions.DoctorNotFoundException;
import com.doctor.model.Doctor;

public interface IDoctorDao {
	

	
void addDoctor(Doctor doctor);

    

    List<Doctor> findAllDoctors();

    int updateDoctor(int doctorId, double fees);

    void deleteDoctor(int doctorId);

    Doctor findById(int doctorId);

    

    List<Doctor> findBySpeciality(String speciality) throws DoctorNotFoundException;

    List<Doctor> findBySpecialityAndExperience(String speciality, int experience) throws DoctorNotFoundException;

    List<Doctor> findBySpecialityAndFees(String speciality, double fees) throws DoctorNotFoundException;

}



