package com.doctor.client;

import com.doctor.model.Doctor;
import com.doctor.service.DoctorServiceImpl;
import com.doctor.service.IDoctorService;

public class DoctorMain {
	public static void main(String[] args) {

        Doctor doctor = new Doctor("Aaron", "Cardiologist", 44, 6);

        IDoctorService doctorService = new DoctorServiceImpl();

        doctorService.addDoctor(doctor);

    }

}
