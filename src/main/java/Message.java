//id is a unique id which identifies the message
//
//datetime is the time at which the message was created
//
//content is the text content of the message created by the sender
//
//from is the instance of User that sent the message
//
//to is the instance of User that receives the message
//
//delivered is true once the recipient has received the message
//
//read is true one the recipient has read the message
//
//log() prints the message details to the console in a readable format
//
//markDelivered() sets delivered to true DONE ********************************
//
//markRead() sets read to true DONE *******************************************

import java.util.Date;

public class Message {

    public  static int id = 0;
    public  Date datetime;
    public  String content;
    public  User from;
    public  User to;
    public  boolean delivered;
    public  boolean read;


    public Message(int id, String content) {
        this.id = id;
        this.datetime = new Date();
        this.content = content;
        this.from = null;
        this.to = null;
        this.delivered = false;
        this.read = false;
    }

    public static Message createMessage(String messageContent){
        id += 1;
        return new Message(id, messageContent);
    }


    public void log(){
        String leftAlignFormat = "| %-15s | %-34s |%n";
        System.out.println("Message Info:");
        System.out.format("+-----------------+------------------------------------+%n");
        System.out.format(leftAlignFormat, "ID: " + this.id , "Date: " + this.datetime);
        System.out.format("+-----------------+------------------------------------+%n");
        System.out.format(leftAlignFormat, "From: " + this.from.username, "To: " + this.to.username);
        System.out.format("+-----------------+------------------------------------+%n");
        System.out.format(leftAlignFormat, "Delivered: " + this.delivered, "Read: " + this.read);
        System.out.format("+-----------------+------------------------------------+%n");
        System.out.println("Message content:\n" + this.content);
        System.out.format("+------------------------------------------------------+%n");
    }

    public void markDelivered() {
        this.setDelivered(true);
        System.out.println("Message has been delivered.");
    }

    public void markRead() {
        this.setRead(true);
        System.out.println("Message read.");
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }

    public User getTo() {
        return to;
    }

    public void setTo(User to) {
        this.to = to;
    }

    public User getFrom() {
        return from;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id='" + id + '\'' +
                ", datetime='" + datetime + '\'' +
                ", content='" + content + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", delivered=" + delivered +
                ", read=" + read +
                '}';
    }
}

