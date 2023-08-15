package com.drama.service;

import java.util.List;

import com.drama.dao.DramaDaoImpl;
import com.drama.dao.IDramaDao;
import com.drama.exceptions.DramaNotFoundException;
import com.drama.model.Drama;

public class DramaServiceImpl implements IDramaService {
	IDramaDao dramaService =new DramaDaoImpl();

	@Override
	public void addDrama(Drama drama) {
		// TODO Auto-generated method stub
		dramaService.addDrama(drama);
		
	}

	@Override
	public int updateDrama(int dramaId, String diction) {
		// TODO Auto-generated method stub
		return dramaService.updateDrama(dramaId, diction);
	}

	@Override
	public Drama getById(int dramaId) {
		// TODO Auto-generated method stub
		return dramaService.findBydramaId(dramaId);
	}

	@Override
	public void deleteDrama(int dramaId) {
		// TODO Auto-generated method stub
		dramaService.deleteDrama(dramaId);
		
	}

	@Override
	public List<Drama> getAllDramas() {
		// TODO Auto-generated method stub
		return dramaService.findAllDramas();
	}

	@Override
	public List<Drama> getByDiction(String Diction) throws DramaNotFoundException {
		// TODO Auto-generated method stub
		return dramaService.findByDiction(Diction);
	}

	@Override
	public List<Drama> getByDictionAndRating(String Diction, int rating) throws DramaNotFoundException {
		// TODO Auto-generated method stub
		return dramaService.findByDictionAndrating(Diction, rating);
	}

	@Override
	public List<Drama> getByDictionAndEpisodes(String Diction, int episodes) throws DramaNotFoundException {
		// TODO Auto-generated method stub
		return dramaService.findByDictionAndepisodes(Diction, episodes);
	}

	
}
