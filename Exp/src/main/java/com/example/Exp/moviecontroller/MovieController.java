package com.example.Exp.moviecontroller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.Exp.movie.Movies;
import com.example.Exp.movieservice.MovieService;

@RestController
public class MovieController {
	@Autowired
	public MovieService movieService;
	
	
	@GetMapping("/movies")
	public List<Movies> getMovies(){
		return this.movieService.getMovies();
	}
	
	@GetMapping("/movies/{movie_Name}")
	public Movies getMovies(@PathVariable String movie_Name) {
		return this.movieService.getMovie(movie_Name);
	}
	
	@PostMapping("/movies")
	public Movies addMovies(@RequestBody Movies movies) {
		return this.movieService.addMovies(movies);
	}
	
	@PutMapping("/movies")
	public Movies updateMovies(@RequestBody Movies movies) {
		return this.movieService.updateMovies(movies);
	}
	
	@DeleteMapping("/movies/{movie_Name}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String movie_Name){
		try {
			this.movieService.deleteMovies(movie_Name);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
