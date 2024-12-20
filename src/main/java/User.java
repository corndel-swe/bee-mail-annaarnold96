//id is a unique string which identifies the user
//
//username is the user's username
//
//inbox is a list of messages the user has received
//
//app is the instance of App the user is logged into
//
//login(app) adds the user to app.users and also sets user.app to app
//
//sendMessage() creates a new message and adds it to the messages array of the recipient user
//
//receiveMessage() handles adding an incoming message to the messages array
//
//readMessage() logs the message at the given index in messages to the console, and marks the message as read

import java.util.List;

public class User {
    public int id;
    public String username;
    public List<Message> inbox;
    public App app;


    public User(){
    }

    public User(int id, String username, List<Message> inbox, App app) {
        this.id = id;
        this.username = username;
        this.inbox = inbox;
        this.app = app;
    }

    public void login(App app){
        System.out.println("Logging " + this.username + " into app: " + app);
        setApp(app);
        app.addUser(this);
    }

    public void sendMessage(Message message, User to){
        message.setTo(to);
        message.setFrom(this);
        System.out.println("Message sent from " + this.username + " to " + to.username);
        to.receiveMessage(message);
    }

    public void receiveMessage(Message message){
        inbox.add(message);
        message.markDelivered();
//        System.out.println(message);

    }

    public void readMessage(int messageIndex){
        Message currentMessage = inbox.get(messageIndex);
        currentMessage.log();
        currentMessage.markRead();

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Message> getInbox() {
        return inbox;
    }

    public void setInbox(List<Message> inbox) {
        this.inbox = inbox;
    }

    public App getApp() {
        return app;
    }

    public void setApp(App app) {
        this.app = app;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", inbox=" + inbox +
                ", app=" + app +
                '}';
    }
}