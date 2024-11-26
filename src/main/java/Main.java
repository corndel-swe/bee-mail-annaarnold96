import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        App app = App.getInstance();
        User user = new User("1","anna",new ArrayList<>(List.of()), null);
        User user2 = new User("2","robin",new ArrayList<>(List.of()), null);
        User user3 = new User("3","Pickle",new ArrayList<>(List.of()), null);
        user.login(app);
        user2.login(app);
        user3.login(app);
        Message message = new Message("1","1","1","1","1");
        app.deliverMessage("3",message,"2");
    }
}
