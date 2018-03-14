package films;

import java.util.*;

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

    public List<Movie> findMovies(Actor actor) {
        List<Movie> tmpMovies = new ArrayList<>();
        Set<Map.Entry<Movie, List<Actor>>> entries = filmRoles.entrySet();
        for (Map.Entry<Movie, List<Actor>> entry : entries) {
            List<Actor> actorsInMap = entry.getValue();
            if (actorsInMap.contains(actor)) {
                tmpMovies.add(entry.getKey());
            }
        }
        return tmpMovies;
    }

    public List<Movie> findMovies() {
        return new ArrayList<>(movies);
    }

    public Actor findActor(int actorId) {
        return actors.get(actorId);
    }
}
