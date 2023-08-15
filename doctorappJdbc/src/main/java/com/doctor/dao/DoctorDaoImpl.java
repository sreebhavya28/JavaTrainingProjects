package com.doctor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.doctor.exceptions.DoctorNotFoundException;
import com.doctor.model.Doctor;
import com.doctor.util.DbConnection;
import com.doctor.util.Queries;

public class DoctorDaoImpl implements IDoctorDao {

	@Override
	public void addDoctor(Doctor doctor) {
		try(Connection connection = DbConnection.openConnection(); // get the connection

                PreparedStatement statement = connection.prepareStatement(Queries.INSERTQUERY);    ) {
		
            statement.setString(1, doctor.getDoctorName());
            statement.setString(2, doctor.getSpeciality());
            statement.setInt(3, doctor.getExperience());
            statement.setDouble(4, doctor.getFees());
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();

        }
		
	}

	@Override
	public List<Doctor> findAllDoctors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateDoctor(int doctorId, double fees) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteDoctor(int doctorId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Doctor findById(int doctorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> findBySpeciality(String speciality) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> findBySpecialityAndExperience(String speciality, int experience)
			throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> findBySpecialityAndFees(String speciality, double fees) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
