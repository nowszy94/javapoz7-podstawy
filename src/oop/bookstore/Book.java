package oop.bookstore;

public class Book {
    private String title;
    private String description;
    private int releaseYear;
    private String publisher;
    private Author author;

    public Book(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getAuthorName() {
        return author != null ? author.getName() : null;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + (author != null ? author.getName() : "") + '\'' +
                ", description='" + description + '\'' +
                ", releaseYear=" + releaseYear +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
