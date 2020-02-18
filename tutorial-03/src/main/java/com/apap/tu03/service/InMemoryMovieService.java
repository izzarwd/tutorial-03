package com.apap.tu03.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.apap.tu03.model.MovieModel;

@Service
public class InMemoryMovieService implements MovieService{
	private List<MovieModel> archiveMovie;
	
	public InMemoryMovieService() {
		archiveMovie = new ArrayList<>();
	}
	
	@Override
	public void addMovie(MovieModel movie) {
		archiveMovie.add(movie);
	}
	
	@Override
	public void updateDuration(MovieModel movie, Integer duration) {
		for(int a=0; a<archiveMovie.size(); a++) {
			if((archiveMovie.get(a)).equals(movie)) {
				(archiveMovie.get(a)).setDuration(duration);
			}
		}
	}
	
	@Override
	public void deleteMovie(MovieModel movie) {
		archiveMovie.remove(movie);
	}
	

	@Override
	public List<MovieModel> getMovieList() {
		return archiveMovie;
	}

	@Override
	public MovieModel getMovieDetail(String id) {
		for(MovieModel movie: archiveMovie) {
			if(id.equals(movie.getId())) {
				return movie;
			}
		}
		return null;
	}
}
