package Task02;

public class Member {
    private String name;
    private String email;
    private String contact;

    // constructor
    public Member(String name, String email, String contact){
        this.name = name;
        this.email = email;
        this.contact = contact;
    }

    // toString
    @Override
    public String toString() {
        return "Member [name=" + name + ", email=" + email + ", conatct=" + contact + "]";
    }

    // getters
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getContact(){
        return contact;
    }
   
}