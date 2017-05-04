package bridges;

import java.util.List;

/**
 * Created by Di on 04.05.2017.
 */
public interface SocialWeb
{
    List<String> getFriends();

    void pay(int value);

    List<String> wall();
}
