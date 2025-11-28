package Question02;

public abstract class User {
    protected String userId;
    protected String name;
    protected String phone;

    public User(String userId, String name, String phone) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
    }

    public abstract void displayProfile();
}
