package bridges;

import facade.Detective;
import facade.Inspector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Di on 04.05.2017.
 */
public class BasicSocialWeb implements SocialWeb, Detective, Inspector
{

    private DB postgreDB = new PostgreDB();

    private List<String> friends = new ArrayList<>();
    {
        friends.add("Alexey");
        friends.add("Artem");
        friends.add("Nicolay");
    }

    @Override
    public String getDetective() {

        String detectiveStr = "Friends: \n";

        for (String fr:friends
             ) {
            detectiveStr += fr + "\n";
        }
        detectiveStr += "\n Notifications: \n";

        for (String notification:notifications
                ) {
            detectiveStr += notification + "\n";
        }
        detectiveStr += "\n";

        return detectiveStr;
    }



    private int money = 0;

    private List<String> notifications =
            Arrays.asList("notification1",
                                "notification2",
                                "notification3");

    @Override
    public List<String> getFriends() {
        return postgreDB.getListOfFriends() /*friends*/;
    }

    List<Integer> listOfPayments = new ArrayList<>();

    @Override
    public void pay(int value) {
//        money += value;

        listOfPayments.add(value);
        money += postgreDB.getMoney() + value;
    }

    @Override
    public String getPaymentInspect() {

        String inspectorStr = "";
        for (int i = 0; i < listOfPayments.size(); i++)
        {
            inspectorStr += "\npayment" + i + " = " + listOfPayments.get(i);
        }
        return inspectorStr;
    }

    @Override
    public List<String> wall() {
        return postgreDB.getWall() /*notifications*/;
    }
}
