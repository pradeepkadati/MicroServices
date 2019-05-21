package io.kp.api.movierating.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.kp.api.movierating.model.Ratings;

@RestController
@RequestMapping(value = "/ratings")
public class RatingResource {

	private final List<Ratings> ratings = new ArrayList<>();
	
	public RatingResource() {
		ratings.add(new Ratings("aaa",3));
		ratings.add(new Ratings("bbb",4));
		ratings.add(new Ratings("ccc",2));
		ratings.add(new Ratings("ddd",3));
	}
	
		
	@RequestMapping(value = "/{movieId}",method = RequestMethod.GET)
	public Ratings getRating(@PathVariable("movieId") String movieId) {
		return ratings.stream().filter(rating -> rating.getMovieId().equals(movieId)).findFirst().orElse(null);
	}
}
