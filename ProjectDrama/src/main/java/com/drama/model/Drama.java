package com.drama.model;

public class Drama {
	private String dramaName;
	private int dramaId;
	private int rating;
	private String genre;
	private Integer episodes;
	private String diction;
	public Drama() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Drama(String dramaName, String genre, Integer episodes, String diction, Integer rating) {
		super();
		this.dramaName = dramaName;
//		this.dramaId = dramaId;
		this.rating = rating;
		this.genre = genre;
		this.episodes = episodes;
		this.diction = diction;
	}

	public String getDramaName() {
		return dramaName;
	}
	public void setDramaName(String dramaName) {
		this.dramaName = dramaName;
	}
	public int getDramaId() {
		return dramaId;
	}
	public void setDramaId(int dramaId) {
		this.dramaId = dramaId;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Integer getEpisodes() {
		return episodes;
	}
	public void setEpisodes(Integer episodes) {
		this.episodes = episodes;
	}
	public String getDiction() {
		return diction;
	}
	public void setDiction(String diction) {
		this.diction = diction;
	}

	@Override
	public String toString() {
		return "Drama [dramaName=" + dramaName + ", rating=" + rating + ", genre=" + genre + ", episodes=" + episodes
				+ ", diction=" + diction + "]";
	}
	
	
	
	
	
	
	
	

}
