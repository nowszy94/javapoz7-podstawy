package oop.bookstore;

public class Author {
    private String name;
    private String birthDate;
    private String language;

    public Author(String name) {
        this.name = name;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getName() {
        return name.toUpperCase();
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + this.getName() + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
