package films;

import java.util.*;

public class MoviesApplication {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Brad", "Pit", 1980);
        Actor actor2 = new Actor("Szymon", "Nowak", 1970);
        Movie movie1 = new Movie("Avatar", "Tutaj opis", 2010,
                new Director("Roman", "Polanski", 1940));
        Movie movie2 = new Movie("Matrix", "Tutaj opis", 2000,
                new Director("Bracia", "Wachowscy", 1970));

        List<Actor> actors = new ArrayList<>();
        actors.add(actor1);
        actors.add(actor2);
        List<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);

        Map<Movie, List<Actor>> roles = new HashMap<>();
        roles.put(movie1, Arrays.asList(actor1, actor2));
        roles.put(movie2, Arrays.asList(actor1));

        MoviesService moviesService = new MoviesService(actors, movies, roles);
        Scanner scanner = new Scanner(System.in);
        int answer;
        do {
            System.out.println("1. Actors");
            System.out.println("2. Movies");
            System.out.println("0. Exit");
            answer = scanner.nextInt();
            scanner.nextLine();

            switch (answer) {
                case 1:
                    actorsView(scanner, moviesService);
                    break;
                case 2:
                    moviesView(scanner, moviesService);
                    break;
            }
        } while(answer != 0);
    }

    private static void actorsView(Scanner scanner, MoviesService moviesService) {
        List<Actor> actors = moviesService.findActors();
        for (Actor actor : actors) {
            System.out.println(actor);
        }
        scanner.nextLine();
    }

    private static void moviesView(Scanner scanner, MoviesService moviesService) {
        List<Movie> movies = moviesService.findMovies();
        for (Movie movie : movies) {
            System.out.println(movie);
        }
        scanner.nextLine();
    }
}
