import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //-- Create object from every class --
        User user1 = new User("aliabumansour", "alimuaffag@gmail.com");
        Book book1 = new Book("Java Basics", "Faisal", "123456", 200.0, 5);
        Music music1 = new Music("Ololo Samah", "Ali Abumansour", "000000", 12.5, "Tamer Ashour");
        Movie movie1 = new Movie("One Piece", "Auda", "159951", 1000, 23);
        Novel novel1 = new Novel("The rabbit and the turtle", "Sohaib Albakri", "11223", 15.99, 3, "Young");
        AcademicBook academicBook1 = new AcademicBook("Math", "Esmaeil Enani", "10101", 0.0, 10000, "Math Basics");
        user1.addToCart(book1);
        user1.addToCart(music1);
        user1.addToCart(movie1);
        //  System.out.println(user1);
        //-- Book Test--
//        System.out.println("Cart before checkout:");
//        for (Media media : user1.getShoppingCart()) {
//            System.out.println(media);
//        }
//
//        user1.checkout();
//
//        System.out.println("\nPurchased items:");
//        for (Media media : user1.getPurchased()) {
//            System.out.println(media);
//        }
//
//        System.out.println("\nCart after checkout:");
//        for (Media media : user1.getShoppingCart()) {
//            System.out.println(media);
//        }
        // Store store1 = new Store();
        //-- Check reviews and bestseller status
//        book1.addReview(new Review("ali", 5, "Great book ever"));
//        book1.addReview(new Review("mohammed", 4, "Great"));
//        System.out.println("\nAverage rating is: " + book1.getAverageRating());
//        System.out.println("Book classification: " + book1.getMediaType());
//        book1.restock(3);
//        System.out.println("Updated stock: " + book1.getStock());

          //-- Music Test --
//        Movie movie2 = new Movie("Attack on titan", "Omar Abumansour", "02020", 29.99, 23);
//        Movie movie3 = new Movie("Dragon Ball", "Auda", "02020", 29.99, 23);
//        List<Movie> movieCatalog = new ArrayList<>();
//        movieCatalog.add(movie1);
//        movieCatalog.add(movie2);
//        movieCatalog.add(movie3);
//        System.out.println(" Recommended movies similar to: " + movie1.getTitle()+" is: ");
//        for (Movie m : movie1.recommendSimilarMovies(movieCatalog)) {
//            System.out.println(m);
//        }

               // Test generating playlist
//        Music music2 = new Music("Alamakn", "Ali Abumansour", "999000", 9.5, "Mohammed Abdu");
//        Music music3 = new Music("Bnt alnour", "Ali Abumansour", "888000", 9.5, "Mohammed Abdu");
//        List<Music> musicCatalog = new ArrayList<>();
//        musicCatalog.add(music1);
//        musicCatalog.add(music2);
//        musicCatalog.add(music3);
//        System.out.println("Generated playlist for artist: " + music1.getAuteur());
//        for (Music m : music2.generatePlaylist(musicCatalog)) {
//            System.out.println(m);
//        }
    }

    }