package com.example.Exp.movieservice;

import java.util.List;
import com.example.Exp.movie.Movies;

public interface MovieService {
	public List<Movies> getMovies();
	public Movies getMovie(String movie_Name);
	public Movies addMovies(Movies movies);
	public Movies updateMovies(Movies movies);
	public void deleteMovies(String movie_Name);
}
