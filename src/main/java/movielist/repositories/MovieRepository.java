package movielist.repositories;

import movielist.entities.Movie;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

// CrudRepository is an interface so MovieRepository must also be an interface in order to extend it
public interface MovieRepository extends CrudRepository<Movie, Long> {

}
