package bridges;

import java.util.List;

/**
 * Created by Di on 04.05.2017.
 */
public class ExtendedSocialWebAdapter implements
                            ExtendedSocialWeb
{

    private BasicSocialWeb extendedSocialWeb;

    public ExtendedSocialWebAdapter
            (BasicSocialWeb extendedSocialWeb) {
        this.extendedSocialWeb = extendedSocialWeb;
    }

    @Override
    public String getHistory(int userId, String date) {
        if (extendedSocialWeb instanceof VKSocialWeb)
        {
            return new VKSocialWeb().getHistory();
        }
        if (extendedSocialWeb instanceof FacebookSocialWeb)
        {
            return new FacebookSocialWeb()
                                .getHistory(date);
        }
        return null;
    }

    @Override
    public List<Integer> getLikes(int userId,
                                  boolean showNegative,
                                  int messageId) {

        if (extendedSocialWeb instanceof VKSocialWeb)
        {
            return new VKSocialWeb()
                    .getLikes(userId,messageId);
        }
        if (extendedSocialWeb instanceof FacebookSocialWeb)
        {
            return new FacebookSocialWeb()
                    .getLikes(messageId,
                            showNegative,userId);
        }
        return null;
    }
}
