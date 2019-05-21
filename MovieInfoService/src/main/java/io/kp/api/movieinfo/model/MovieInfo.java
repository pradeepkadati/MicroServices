package io.kp.api.movieinfo.model;

/**
 * 
 * @author Pradeep Kadati
 *
 */
public class MovieInfo {

	private String movieId;
	private String movieName;
	private String desc;
	
	
	public MovieInfo() {
		super();
		
	}
	
	
	public MovieInfo(String movieId, String movieName, String desc) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.desc = desc;
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
	
	
}
