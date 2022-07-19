package com.example.Exp.movieservice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import com.example.Exp.movie.Movies;

@Service
public class MoviesServiceImpl implements MovieService{
	
	List<Movies>list;
	
	public MoviesServiceImpl() {
		list = new ArrayList<>();
		list.add(new Movies("MoS","Z.S","H.C"));
		list.add(new Movies("Bvs","Z.S","Multiple"));
	}

	@Override
	public List<Movies> getMovies() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Movies getMovie(String movie_Name) {
		Movies m=null;
		for(Movies movies:list) {
			if(movies.getMovie_Name().equalsIgnoreCase(movie_Name)) {
				m=movies;
				break;
			}
		}
		return m;
	}

	@Override
	public Movies addMovies(Movies movies) {
		list.add(movies);
		return movies;
	}

	@Override
	public Movies updateMovies(Movies movies) {
		list.forEach(e->{
			if(e.getMovie_Name().equalsIgnoreCase(movies.getMovie_Name())) {
				e.setDirector(movies.getDirector());
				e.setActor(movies.getActor());
			}
		});
		return movies;
	}

	@Override
	public void deleteMovies(String movie_Name) {
		list=this.list.stream().filter(e->e.getMovie_Name()!=movie_Name).collect(Collectors.toList());
		
	}

	
}
