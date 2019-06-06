package io.kp.api.moviecatalog.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.kp.api.moviecatalog.models.MovieDetails;
import io.kp.api.moviecatalog.models.MovieInfo;
import io.kp.api.moviecatalog.models.Ratings;

@RestController
@RequestMapping(value = "/catalog")
public class MovieCatalogResource {
	
	@Autowired
	private RestTemplate template;
	
	@RequestMapping(value = "{movieId}",method = RequestMethod.GET)
	public MovieDetails getMovieDetails(@PathVariable("movieId") String movieId) {
		
	 MovieInfo mi = template.getForObject("http://MOVIEINFO/movieinfo/movie/"+movieId, MovieInfo.class);
	 Ratings ratings = template.getForObject("http://MOVIERATING/movierating/ratings/"+movieId, Ratings.class);
		
	 MovieDetails details = new MovieDetails(movieId, mi.getMovieName(), mi.getDesc(), ratings.getRating());
	 
	 return details;
	}
 
}
