package com.drama.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.drama.exceptions.DramaNotFoundException;
import com.drama.model.Drama;
import com.drama.util.DbConnection;
import com.drama.util.Queries;

public class DramaDaoImpl implements IDramaDao {

	@Override
	public void addDrama(Drama drama) {

		try (Connection connection = DbConnection.openConnection(); // get the connection

				PreparedStatement preparedStatement = connection.prepareStatement(Queries.INSERTQUERY);) {

			preparedStatement.setString(1, drama.getDramaName());
//            preparedStatement.setInt(2, drama.getDramaId());
			preparedStatement.setString(2, drama.getGenre());

			preparedStatement.setInt(3, drama.getEpisodes());
			preparedStatement.setString(4, drama.getDiction());
			preparedStatement.setInt(5, drama.getRating());
			preparedStatement.execute();
			System.out.println("Drama added successfully");

		} catch (SQLException e) {
			e.printStackTrace();

		}

	}

	@Override
	public List<Drama> findAllDramas() {

		List<Drama> dramaList = new ArrayList<Drama>();

		try (Connection connection = DbConnection.openConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(Queries.GETALLQUERY);) {
			System.out.println("Fetching all dramas...");
			try (ResultSet dramaResultSet = preparedStatement.executeQuery();) {
				while (dramaResultSet.next()) {

					String name = dramaResultSet.getString("dramaName");
					Integer dramaId = dramaResultSet.getInt("dramaId");

					Integer rating = dramaResultSet.getInt("rating");
					String genre = dramaResultSet.getString("genre");
					Integer episodes = dramaResultSet.getInt("episodes");
					String diction = dramaResultSet.getString("diction");

					Drama drama = new Drama(name, genre, episodes, diction, rating);

					dramaList.add(drama);
					System.out.println(drama.toString());
				}
			}
			return dramaList;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public int updateDrama(int dramaId, String diction) {

		// TODO Auto-generated method stub
		try (Connection connection = DbConnection.openConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(Queries.UPDATEQUERY);) {
			preparedStatement.setString(1, diction);
			preparedStatement.setInt(2, dramaId);
			preparedStatement.execute();
			System.out.println("Drama updated sucesfully");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		return 0;
		return dramaId;

	}

	@Override
	public void deleteDrama(int dramaId) {

		// TODO Auto-generated method stub
		try (Connection connection = DbConnection.openConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(Queries.DELETEBYDRAMAID);) {
			preparedStatement.setInt(1, dramaId);
			preparedStatement.execute();
			System.out.println("Drama with id: " + dramaId + " sucessfully deleted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public Drama findBydramaId(int dramaId) {

		Drama drama = new Drama();
		// TODO Auto-generated method stub
		try (Connection connection = DbConnection.openConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(Queries.QUERYBYDRAMAID);) {
			preparedStatement.setInt(1, dramaId);
			try (ResultSet rt = preparedStatement.executeQuery();) {
				while (rt.next()) {

					String name = rt.getString("dramaName");

					String genre = rt.getString("genre");
					Integer episodes = rt.getInt("episodes");
					String diction = rt.getString("diction");
					Integer rating = rt.getInt("rating");
					drama.setDramaName(name);
					drama.setRating(rating);
					drama.setEpisodes(episodes);
					drama.setDiction(diction);
					System.out.println("Drama found sucesfully");
					System.out.println(drama.toString());
				}
				return drama;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public List<Drama> findByDiction(String Diction) throws DramaNotFoundException {

		// TODO Auto-generated method stub
		List<Drama> dramaList = new ArrayList<Drama>();

		try (Connection connection = DbConnection.openConnection();
				PreparedStatement ps = connection.prepareStatement(Queries.QUERYBYDICTION);) {

			ps.setString(1, Diction);
			System.out.println("Getting drama with platform it plays: " + Diction);
			try (ResultSet rt = ps.executeQuery()) {
				while (rt.next()) {
					String name = rt.getString("dramaName");
					Integer rating = rt.getInt("rating");
					String genre = rt.getString("genre");
					Integer episodes = rt.getInt("episodes");
					String diction = rt.getString("diction");

					Drama drama = new Drama(name, genre, episodes, diction, rating);
					dramaList.add(drama);
					System.out.println(drama.toString());
				}
			}
			return dramaList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public List<Drama> findByDictionAndrating(String Diction, int rating) throws DramaNotFoundException {

		// TODO Auto-generated method stub
		List<Drama> dramaList = new ArrayList<Drama>();
		try (Connection connection = DbConnection.openConnection();
				PreparedStatement ps = connection.prepareStatement(Queries.QUERYBYDICTIONRATING);) {

			ps.setString(1, Diction);
			ps.setInt(2, rating);
			System.out.println(
					"Getting dramas with platform it plays: " + Diction + " and with rating of: " + rating + " number");

			try (ResultSet rt = ps.executeQuery()) {
				while (rt.next()) {
					String name = rt.getString("dramaName");
					Integer rating1 = rt.getInt("rating");
					Integer episodes = rt.getInt("episodes");
					String diction1 = rt.getString("diction");
					String genre = rt.getString("genre");

					Drama drama = new Drama(name, genre, episodes, diction1, rating1);
					dramaList.add(drama);
					System.out.println(drama.toString());
				}
			}
			return dramaList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public List<Drama> findByDictionAndepisodes(String diction, Integer episodes) throws DramaNotFoundException {

		// TODO Auto-generated method stub
		List<Drama> dramaList = new ArrayList<Drama>();

		try (Connection connection = DbConnection.openConnection();
				PreparedStatement ps = connection.prepareStatement(Queries.QUERYBYDICTIONEPISODES);) {

			ps.setString(1, diction);
			ps.setDouble(2, episodes);
			System.out.println("Getting drama with zone it plays: " + diction + " and with episodes of: " + episodes);
			try (ResultSet rt = ps.executeQuery()) {
				while (rt.next()) {
					String name = rt.getString("dramaName");
					Integer rating = rt.getInt("rating");
					String genre = rt.getString("genre");
					Integer episode = rt.getInt("episodes");

					Drama drama = new Drama(name, genre, episodes, diction, rating);
					dramaList.add(drama);
					System.out.println(drama.toString());
				}
			}
			return dramaList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

}
