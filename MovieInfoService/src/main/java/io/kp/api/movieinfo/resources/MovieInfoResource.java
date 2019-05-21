package io.kp.api.movieinfo.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.kp.api.movieinfo.model.MovieInfo;

@RestController
@RequestMapping("/movie")
public class MovieInfoResource {

	private final List<MovieInfo> movieInfo = new ArrayList<>();

	public MovieInfoResource() {
		movieInfo.add(new MovieInfo("aaa", "movie aaa", "desc aaaa"));
		movieInfo.add(new MovieInfo("bbb", "movie bbb", "desc bbbb"));
		movieInfo.add(new MovieInfo("ccc", "movie ccc", "desc cccc"));
		movieInfo.add(new MovieInfo("ddd", "movie ddd", "desc dddd"));
	}
	
	@RequestMapping("/{movieId}")
	public MovieInfo getMovieInfo(@PathVariable("movieId") String movieId) {
		return	movieInfo.stream().filter(movie -> movie.getMovieId().equals(movieId)).findFirst().orElse(null);
	}

}
