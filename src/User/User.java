package User;

import Storage.Depository;
import java.util.ArrayList;

public class User {
    private final String USERNAME;
    private final String USEREMAIL;
    private final String PASSWORD;
    private ArrayList<Depository> depositories;


    public User(String USERNAME, String USEREMAIL, String PASSWORD){
        this.USERNAME = USERNAME;
        this.USEREMAIL = USEREMAIL;
        this.PASSWORD = PASSWORD;
        this.depositories = new ArrayList<>();
    }
}

