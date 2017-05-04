package builder.galustyan;

import builder.HouseBuilder;

/**
 * Created by Di on 03.05.2017.
 */
public class DjamshutBuilder implements HouseBuilder
{

    private String basement;
    private String walls;
    private String roof;

    @Override
    public void fillBasement() {
        basement = "Djamshut basement";
    }

    @Override
    public void createWalls() {
        walls = "Djamshut walls";
    }

    @Override
    public void createRoof() {
        roof = " Djamshut roof";
    }


    @Override
    public String getResult()
    {
        return basement + " " + walls + " " + roof;
    }

}
