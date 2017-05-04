package bridges;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Di on 04.05.2017.
 */
public class PostgreDB implements DB
{

    @Override
    public List<String> getListOfFriends() {

        return Arrays.asList("postgre Misha",
                                "postgre Vova",
                            "postgre Andrey");
    }

    @Override
    public int getMoney() {
        return 150;
    }

    @Override
    public List<String> getWall() {
        return Arrays.asList("postgre story1",
                                "postgre story2",
                                "postgre story3");
    }
}
