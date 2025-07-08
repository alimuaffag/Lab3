import java.util.*;
class Movie extends Media {
    private int duration;

    public Movie(String title, String auteur, String ISBN, double price, int duration) {
        super(title, auteur, ISBN, price);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void watch(User user) {
        user.getPurchased().add(this);
    }

    public List<Movie> recommendSimilarMovies(List<Movie> movieCatalog) {
        List<Movie> similar = new ArrayList<>();
        for (Movie movie : movieCatalog) {
            if (movie.getAuteur().equals(this.getAuteur())) {
                similar.add(movie);
            }
        }
        return similar;
    }

    @Override
    public String getMediaType() {
        if (duration>=120){
            return "Long Movie";
        }else {
            return "Movie";
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Duration: " + duration + " Minutes";
    }
}