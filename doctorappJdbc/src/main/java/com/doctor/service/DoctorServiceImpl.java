package com.doctor.service;

import java.util.List;

import com.doctor.dao.DoctorDaoImpl;
import com.doctor.dao.IDoctorDao;
import com.doctor.exceptions.DoctorNotFoundException;
import com.doctor.model.Doctor;

public class DoctorServiceImpl  implements IDoctorService{
  
	
	IDoctorDao doctorDao = new DoctorDaoImpl();
	
	
	@Override
	public void addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		doctorDao.addDoctor(doctor);
		
	}

	@Override
	public int updateDoctor(int doctorId, double fees) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Doctor getById(int doctorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteDoctor(int doctorId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List getAllDoctors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getBySpeciality(String speciality) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getBySpecialityAndExp(String speciality, int experience) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getBySpecialityAndfees(String speciality, double fees) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
