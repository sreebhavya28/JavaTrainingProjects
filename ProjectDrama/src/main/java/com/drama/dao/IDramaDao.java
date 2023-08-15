package com.drama.dao;

import java.util.List;

import com.drama.exceptions.DramaNotFoundException;
import com.drama.model.Drama;



public interface IDramaDao {
void addDrama(Drama drama);

    

    List<Drama> findAllDramas();

    int updateDrama(int dramaId, String diction);

    void deleteDrama(int dramaId);

    Drama findBydramaId(int dramaId);

    

    List <Drama> findByDiction (String Diction) throws DramaNotFoundException;
	 List <Drama> findByDictionAndrating(String Diction, int dramaId) throws DramaNotFoundException;
	 List <Drama> findByDictionAndepisodes(String speciality,Integer episodes) throws DramaNotFoundException;



	



	





	

	
	 

}
