package movielist.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

import movielist.entities.Movie;
import movielist.repositories.MovieRepository;

@RestController
@RequestMapping("/movies")
public class MovieListController {
  /*
  INJECT REPOSITORY w/ @Autowired annotation on controller instance field:
  instantiates movieRepository without need for constructor method.
  */

  @Autowired
  private MovieRepository movieRepository;

  /*
   * INJECT REPOSITORY w/o @Autowired
   * need a constructor method to instantiate the repository
   *
   public MovieListController(MovieRepository movieRepository) {
    this.movieRepository = movieRepository;
  }
   */

  // CHORE: GET ALL MOVIES
  @GetMapping
  public Iterable<Movie> getAllMovies() {
    return movieRepository.findAll();
  }

  // CHORE: ADD A MOVIE TO LIST
  // curl -X POST -d "name=Inception&watched=true" http://localhost:8081/movies/add
  @PostMapping("/add")
  public Movie addMovie(@RequestParam String name, @RequestParam Boolean watched) {

    Movie newMovie = new Movie();
    newMovie.setName(name);
    newMovie.setWatched(watched);
    movieRepository.save(newMovie);
    return newMovie;
  }

  // CHORE: GET 1 MOVIE BY ID
  @GetMapping("/{id}")
  public Movie getMovieById(@PathVariable("id") Long id) {

    // check optional
    Optional<Movie> optionalMovie = movieRepository.findById(id);
    if (!optionalMovie.isPresent()) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Movie not found with ID: " + id);
    }

    // retrieve from optional & return
    return optionalMovie.get();
  }
  // CHORE: TOGGLE MOVIE SEEN


  // CHORE: DELETE MOVIE FROM LIST



}
