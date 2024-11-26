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

public class Message {

    public  String id;
    public  String datetime;
    public  String content;
    public  String from;
    public  String to;
    public  boolean delivered;
    public  boolean read;


    public Message(String id, String datetime, String content, String from, String to) {
        this.id = id;
        this.datetime = datetime;
        this.content = content;
        this.from = from;
        this.to = to;
        this.delivered = false;
        this.read = false;
    }

    public void log(){
        System.out.println(this);

    }

    public void markDelivered() {
        delivered = true;

    }

    public void markRead() {
        read = true;
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

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

