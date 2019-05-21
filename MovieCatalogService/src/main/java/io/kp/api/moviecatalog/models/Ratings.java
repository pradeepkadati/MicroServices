package io.kp.api.moviecatalog.models;

/**
 * 
 * @author Pradeep Kadati
 *
 */

public class Ratings {

	private String movieId;
	private int rating;
	
	public Ratings() {
		super();
	}
	
	public Ratings(String movieId, int rating) {
		super();
		this.movieId = movieId;
		this.rating = rating;
	}
	
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
}
