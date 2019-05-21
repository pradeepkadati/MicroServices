package io.kp.api.moviecatalog.models;

public class MovieDetails {

	private String movieId;
	private String movieName;
	private String desc;
	private int rating;
	
	public MovieDetails() {
		super();
	}
	
	public MovieDetails(String movieId, String movieName, String desc, int rating) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.desc = desc;
		this.rating = rating;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
}
