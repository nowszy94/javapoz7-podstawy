package films;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MoviesService {
    private List<Actor> actors;
    private List<Movie> movies;
    private Map<Movie, List<Actor>> filmRoles;

    public MoviesService() {
        this(new ArrayList<>(), new ArrayList<>());
    }

    public MoviesService(List<Actor> actors, List<Movie> movies) {
        this(actors, movies, new HashMap<>());
    }

    public MoviesService(List<Actor> actors, List<Movie> movies, Map<Movie, List<Actor>> filmRoles) {
        this.actors = actors;
        this.movies = movies;
        this.filmRoles = filmRoles;
    }

    public List<Actor> findActors() {
        return new ArrayList<>(actors);
    }

    public List<Movie> findMovies() {
        return new ArrayList<>(movies);
    }
}
