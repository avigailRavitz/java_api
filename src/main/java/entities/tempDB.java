package entities;
import java.util.ArrayList;
import java.util.List;
public class tempDB {

    public static List<User> users = new ArrayList<>();
    static{
        users.add(new User(1, "Ester"));
        users.add(new User(2, "Rachel"));
        users.add(new User(3, "Shoshana"));
        users.add(new User(4, "Riki"));
    }
}
