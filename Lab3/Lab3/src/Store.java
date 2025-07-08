import java.util.*;

class Store {
    private List<Media> mediaList = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void displayUsers() {
        for (User user : users) {
            System.out.println(user.getUsername() + " - " + user.getEmail());
        }
    }

    public void addMedia(Media media) {
        mediaList.add(media);
    }

    public void displayMedias() {
        for (Media media : mediaList) {
            System.out.println(media);
        }
    }

    public Book searchBook(String title) {
        for (Media media : mediaList) {
            if (media instanceof Book && media.getTitle().equalsIgnoreCase(title)) {
                return (Book) media;
            }
        }
        return null;
    }

}
