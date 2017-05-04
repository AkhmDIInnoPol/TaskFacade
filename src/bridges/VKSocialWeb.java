package bridges;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Di on 04.05.2017.
 */
public class VKSocialWeb extends BasicSocialWeb
{

    public String getHistory()
    {
        return "VKSocialWeb history";
    }

    public List<Integer> getLikes(int userId,
                                  int messageId)
    {
        return Arrays.asList(1,2,3);
    }
}
