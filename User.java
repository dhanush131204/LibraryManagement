// User.java
public class User {
    private int userId;
    private String name;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public void displayUserInfo() {
        System.out.println("User ID: " + userId + " | Name: " + name);
    }
}
