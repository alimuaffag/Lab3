import java.util.*;

class User {
    private String username;
    private String email;
    private List<Media> purchased = new ArrayList<>();
    private List<Media> shoppingCart = new ArrayList<>();

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPurchased(List<Media> purchased) {
        this.purchased = purchased;
    }

    public void setShoppingCart(List<Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public List<Media> getPurchased() {
        return purchased;
    }

    public List<Media> getShoppingCart() {
        return shoppingCart;
    }

    public void addToCart(Media media) {
        shoppingCart.add(media);
    }

    public void removeFromCart(Media media) {
        shoppingCart.remove(media);
    }

    public void checkout() {
        for (Media media : shoppingCart) {
            purchased.add(media);
            if (media instanceof Book) {
                Book book = (Book) media;
                book.setStock(book.getStock() - 1);
            }
        }
        shoppingCart.clear();
    }

    @Override
    public String toString() {
        return "\nUser{" +
                "\nusername='" + username + '\'' +
                "\n, email='" + email + '\'' +
                "\n, purchased=" + purchased +
                "\n, shoppingCart=" + shoppingCart +
                '}';
    }
}
