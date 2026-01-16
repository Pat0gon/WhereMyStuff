package User;

import Storage.*;
import java.util.ArrayList;
import java.util.HashMap;

public class User {
    private String username;
    private final String USEREMAIL;
    private int passwordH;
    private ArrayList<String> ownedDeposID;
    private ArrayList<String> grantedAccessDeposID;
    private HashMap<String, ArrayList<String>> userIDgrantingAccess;

    public User(String username, String USEREMAIL, String password){
        this.username = username;
        this.USEREMAIL = USEREMAIL;
        this.passwordH = password.hashCode();
        this.ownedDeposID = new ArrayList<>();
        this.grantedAccessDeposID = new ArrayList<>();
        this.userIDgrantingAccess = new HashMap<>();
        

    }

    public boolean checkPassword(String password){
        return this.password == password.hashCode();
    }

    public boolean changePassword(String oldPassword, String newPassword, String newPassword2){
        if(!newPassword.equals(newPassword2)){
            return false;
        }
        if(checkPassword(oldPassword)){
            this.password = newPassword.hashCode();
            return true;
        }
        return false;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return USEREMAIL;
    }

    

    

    
}

