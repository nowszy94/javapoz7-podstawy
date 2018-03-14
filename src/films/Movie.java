package films;

public class Movie {
    private String title;
    private String description;
    private int releaseDate;
    private Director director;

    public Movie() {
    }

    public Movie(String title, String description, int releaseDate, Director director) {
        this.title = title;
        this.description = description;
        this.releaseDate = releaseDate;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", releaseDate=" + releaseDate +
                ", director=" + director +
                '}';
    }
}
