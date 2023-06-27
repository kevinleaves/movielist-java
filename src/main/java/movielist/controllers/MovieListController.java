package movielist.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;

import movielist.entities.Movie;
import movielist.repositories.MovieRepository;

@RestController
@RequestMapping("/movies")
public class MovieListController {
  // INJECT REPOSITORY
  private MovieRepository movieRepository;

  // need a constructor method to instantiate the repository
  public MovieListController(MovieRepository movieRepository) {
    this.movieRepository = movieRepository;
  }

  // CHORE: GET ALL MOVIES
  @GetMapping
  public Iterable<Movie> getAllMovies() {
    return this.movieRepository.findAll();
  }

  // CHORE: ADD A MOVIE TO LIST
  // curl -X POST -d "name=The Dark Knight Rises&watched=true" http://localhost:8081/movies/add
  @PostMapping("/add")
  public Movie addMovie(@RequestParam String name, @RequestParam Boolean watched) {

    Movie newMovie = new Movie();
    newMovie.setName(name);
    newMovie.setWatched(watched);
    this.movieRepository.save(newMovie);
    return newMovie;
  }

  // CHORE: GET 1 MOVIE BY ID

  // CHORE: TOGGLE MOVIE SEEN

  // CHORE: DELETE MOVIE FROM LIST



}
