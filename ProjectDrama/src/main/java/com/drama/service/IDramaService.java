package com.drama.service;

import java.util.List;

import com.drama.exceptions.DramaNotFoundException;
import com.drama.model.Drama;



public  interface IDramaService {
	 void addDrama (Drama drama) ;
		

	 int updateDrama (int dramaId, String diction);
	 Drama getById(int dramaId);

	 void deleteDrama (int dramaId);
	 List<Drama> getAllDramas();

	

	 List <Drama> getByDiction (String Diction) throws DramaNotFoundException;
	 List <Drama> getByDictionAndRating(String Diction, int rating) throws DramaNotFoundException;
	 List <Drama> getByDictionAndEpisodes(String Diction,int episodes) throws DramaNotFoundException;

	

}
