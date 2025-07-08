import java.util.*;

class Book extends Media {
    private int stock;
    private List<Review> reviews = new ArrayList<>();

    public Book(String title, String auteur, String ISBN, double price, int stock) {
        super(title, auteur, ISBN, price);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public void addReview(Review review) {
        reviews.add(review);
    }

    public double getAverageRating() {
        if (reviews.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (Review review : reviews) {
            sum += review.getRating();
        }
        return (double) sum / reviews.size();
    }

    public void purchase(User user) {
        if (stock > 0) {
            user.getPurchased().add(this);
            stock--;
        }
    }


    public boolean isBestseller() {
       if (getAverageRating()>=4.5){
           return true;
       }else {
           return false;
       }
    }

    public void restock(int quantity) {
        stock += quantity;
        System.out.println("Quantity restocked " + getTitle() + " by " + quantity);
    }

    @Override
    public String getMediaType() {
        if (isBestseller()){
            return "Bestselling Book";
        }else {
            return "Book";
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Stock: " + stock;
    }
}