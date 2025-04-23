package User;

import Storage.Depository;
import java.util.ArrayList;
import java.util.HashMap;

public class User {
    private String userName;
    private final String USEREMAIL;
    private final int PASSWORD;
    private ArrayList<String> ownedStorsID;
    private ArrayList<String> grantedAccessStorsID;
    private HashMap<String, ArrayList<String>> userIDgrantingAccess;



    public User(String userName, String USEREMAIL, String PASSWORD){
        this.userName = userName;
        this.USEREMAIL = USEREMAIL;
        this.PASSWORD = PASSWORD.hashCode();
        this.ownedStorsID = new ArrayList<>();
        this.grantedAccessStorsID = new ArrayList<>();
        this.userIDgrantingAccess = new HashMap<>();
        

    }

}

