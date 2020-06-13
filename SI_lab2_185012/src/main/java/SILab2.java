import java.util.List;

class User {
    String username;
    String password;
    String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}

public class SILab2 {

    public boolean function (User user, List<String> allUsers) {//A
        if (user==null) {
            throw new RuntimeException("The user argument is not initialized!");//B
        }
        else {
            if (user.getUsername()==null || allUsers.contains(user.getUsername())) {//C
                throw new RuntimeException("User already exists!");//D
            }
            else {
                if (user.getEmail()==null)//E
                    return false;//F
                boolean atChar = false, dotChar = false;
                for (int i=0;i<user.getEmail().length();i++) {//G//H-proverka
                    if (user.getEmail().charAt(i)=='@')//J
                        atChar = true;//K
                    if (atChar && user.getEmail().charAt(i)=='.') {//L
                        dotChar = true;//M
                    }
                    //I-increment
                }
                if (!atChar || !dotChar) {//N
                    return false;//O
                }
            }
        }
        return true;//P
    }
}
