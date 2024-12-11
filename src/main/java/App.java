//users is a collection of all users who have logged into the app
//
//addUser() handles adding a new user to the users collection DONE*************************
//
//findUser() gets the user with the given id from the users collection, if possible
//
//deliverMessage() uses the given information to create a new instance of message, and delivers it to the recipient

import java.util.ArrayList;
import java.util.List;

public class App {

    private static App app;
    private static List<User> users = new ArrayList<>();

    public App() {
    }

    public static App getInstance(){
        app = app == null ? new App() : app;

        return app;
    }

    public void addUser(User user){
        users.add(user);
//        System.out.println(users);
    }

    public User findUser(int id){
        User user = null;

        for (int i = 0; i < users.size(); i++){
            if (users.get(i).id == id){
                user = users.get(i);
                break;
            }
        }
        return user;
    }

    public void deliverMessage(int fromId, int toId, Message message){
        User to = app.findUser(toId);
        User from = app.findUser(fromId);
        System.out.println("----\nSending message from " + from.username + " to " + to.username);
        from.sendMessage(message, to);
    }


}

