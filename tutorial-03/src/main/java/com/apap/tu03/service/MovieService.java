package com.apap.tu03.service;

import java.util.List;
import com.apap.tu03.model.MovieModel; 

public interface MovieService {
	void addMovie(MovieModel movie);
	void updateDuration(MovieModel movie, Integer duration);
	void deleteMovie(MovieModel movie);
	List<MovieModel> getMovieList();
	MovieModel getMovieDetail(String id);
}
