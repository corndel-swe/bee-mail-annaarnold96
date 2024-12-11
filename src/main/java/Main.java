import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int messageId = 0;
        App app = App.getInstance();
        User user = new User(1,"anna",new ArrayList<>(List.of()), null);
        User user2 = new User(2,"robin",new ArrayList<>(List.of()), null);
        User user3 = new User(3,"Pickle",new ArrayList<>(List.of()), null);
        user.login(app);
        user2.login(app);
        user3.login(app);

        System.out.println(user3);

        Message message = Message.createMessage("Message number 1");
        Message message2 = Message.createMessage("Message number 2");
        Message message3 = Message.createMessage("Message number 3");
        Message message4 = Message.createMessage("Message number 4");

        app.deliverMessage(3,2,message);
        user2.readMessage(0);
        System.out.println("-----\n-----");
        app.deliverMessage(1,2,message2);
        user2.readMessage(1);
        System.out.println("-----\n-----");
        app.deliverMessage(2,3,message3);
        user3.readMessage(0);
        System.out.println("-----\n-----");
        app.deliverMessage(2,1,message4);
        user.readMessage(0);
        System.out.println("-----\n-----");





    }
}
