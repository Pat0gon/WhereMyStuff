package App;

import User.*;
import Items.*;
import Storage.*;
import java.util.ArrayList;


public class ConsoleApp {
    private static ArrayList<User> users = new ArrayList<>();
    private ArrayList<Storage> storages = new ArrayList<>();

    private static void printMenu(){
        System.out.println("Welcome to WhereMyStuff!");
        System.out.print("""
                        press :
                        '1' to login
                        '2' to register
                        '3' to change password
                        '0' to exit
                        """);
    }

    private static short readCondition(){
        short condition = Short.parseShort(System.console().readLine());
        return condition;
    }

    private static User logInUser(){
        for(User user : users){
            while(true){
                System.out.print("Enter your login or email:");
                String login = System.console().readLine();
                System.out.print("Enter your password:");
                String password = System.console().readLine();
                if(user.getUsername().equals(login) || user.getEmail().equals(login)){
                    if(user.checkPassword(password)){
                        System.out.println("Welcome!");
                        return user;
                    }
                    else return null;
                    }
                }
            }
        return null;
    }

    private static bool registerUser(){}

    private static bool changePassword(){}

    private static bool createNewStorage(){}

    private static bool enterAndManageStorage(){}


    public static void main(String[] args){
    
        while(true){
            short condition = 10;
            System.out.println("welcome to WhereMyStuff!");
            switch(condition){
                case 10 -> {
                    printMenu();
                    condition = readCondition();
                }
                case 1 -> {
                    logInUser();
                    if(user != null){
                        condition = 4;
                    }
                    else{
                        System.out.println("Invalid login or password, try again.");
                        condition = 1;
                    }
                }
                case 2 -> {
                    //register new user;
                    System.out.print("Enter your username:");
                    String username = System.console().readLine();
                    System.out.print("Enter your email:");
                    String email = System.console().readLine();
                    System.out.print("Enter your password:");
                    String password = System.console().readLine();
                    User newUser = new User(username, email, password);
                    users.add(newUser);
                    condition = 4;
                }
                case 3 -> { //change password
                    System.out.print("Enter your username:");
                    String username = System.console().readLine();
                    System.out.print("Enter your old password:");
                    String oldPassword = System.console().readLine();
                    System.out.print("Enter your new password:");
                    String newPassword = System.console().readLine();
                    System.out.print("Repeat your new password:");
                    String newPassword2 = System.console().readLine();
                    for(User user : users){
                        if(user.getUsername().equals(username)){
                            if(user.changePassword(oldPassword, newPassword, newPassword2)){
                                condition = 1;
                                break;
                            }
                            else{
                                System.err.println("Invalid password, try again.");
                                condition = 3;
                                break;
                            }
                        }
                    }

                }
                case 4 -> { //logged in
                    System.out.print("""
                                        press:
                                        '1' to create new storage
                                        '2' to enter your storage
                                        '2' enter and menage storage
                                        '3' to see your friends
                                        '0' to log out
                                        """);               
                    short condition2 = Short.parseShort(System.console().readLine());
                    while(true){
                        switch(condition2){
                            case 1 -> { //create new storage}
                        
                            }
                            case 2 ->{ // enter and menage storage
                            }
                            
                            case 3 -> { //see your friends
                                
                                }
                            }
                        }
                    }
                
                case 0 -> //log out
                {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> //logged in
                    System.out.println("Invalid input, try again.");
            }
        }
    }
}


