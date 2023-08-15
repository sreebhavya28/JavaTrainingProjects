package com.drama.client;

import java.util.Scanner;


import com.drama.model.Drama;
import com.drama.service.DramaServiceImpl;
import com.drama.service.IDramaService;

public class DramaMain {
	
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		IDramaService dramaService = new DramaServiceImpl();
		System.out.println("Welcome to Drama App! Please choose the below operations to perform: ");
		System.out.println(
				"1. Add Drama\n 2. Update Drama \n 3. Get Dramas By ID's \n 4. Get All Dramas\n 5. Delete Drama By Id\n 6. Get  Drama By Diction \n 7. Get Drama By Diction And By Rating\n 8. Get Drama By Diction And By Episodes");
		int choice = scanner.nextInt();
		if (choice == 1) {
			scanner.nextLine();
			System.out.println("Enter name: ");
			String name = scanner.nextLine();
			
			System.out.println("genre: ");
			String genre = scanner.nextLine();
			
			System.out.println("Enter episodes: ");
			Integer episodes = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter Diction: ");
			String diction = scanner.nextLine();
			
			System.out.println("Enter rating: ");
			Integer rating = scanner.nextInt();
			
			
			
			Drama drama = new Drama(name, genre, episodes, diction, rating);
			dramaService.addDrama(drama);

		} else if (choice == 2) {
			System.out.println("Enter drama Id to update diction");
			int dramaId = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter new diction to add to drama");
			String diction= scanner.nextLine ();
			dramaService.updateDrama(dramaId, diction);
		} else if (choice==3) {
			System.out.println("Enter drama Id to fetch drama");
			int dramaId = scanner.nextInt();
			dramaService.getById(dramaId);
		} else if (choice==4) {
			dramaService.getAllDramas();	
		} else if (choice==5) {
			System.out.println("Enter drama Id to delete drama");
			int dramaId = scanner.nextInt();
			dramaService.deleteDrama(dramaId);	
		} else if (choice==6) {
			System.out.println("Enter drama diction to fetch drama");
			scanner.nextLine();
			String diction = scanner.nextLine();
			dramaService.getByDiction(diction);
		} else if (choice==7) {
			System.out.println("Enter drama diction and rating to fetch dramas");
			System.out.println("diction: ");
			String diction = scanner.next();
			System.out.println("Enter rating: ");
			int rating=scanner.nextInt();
			dramaService.getByDictionAndRating(diction, rating);
		} else {
			System.out.println("Enter drama diction and episodes to fetch dramas");
			System.out.println("diction: ");
			String diction = scanner.next();
			System.out.println(diction);
			System.out.println("Enter episodes: ");
			int episodes = scanner.nextInt();
			dramaService.getByDictionAndEpisodes(diction,episodes);
		}


	
}


}
