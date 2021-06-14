public class user {
    //User has username and pin
    String username;
    int userPin;

    //default constructor
    public User(){

    }

    //parameterized constructor
    public User(String username, int userPin) {
        this.username = username;
        this.userPin = userPin;
    }

    //generated getters and setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUserPin() {
        return userPin;
    }

    public void setUserPin(int userPin) {
        this.userPin = userPin;
    }
}

}
