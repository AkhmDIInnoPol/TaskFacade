package builder.galustyan;

import builder.HouseBuilder;

/**
 * Created by Di on 03.05.2017.
 */
public class RafshanBuilder implements HouseBuilder
{
    private String basement;
    private String walls;
    private String roof;


    @Override
    public void fillBasement() {
        basement = "Rafshan basement";
    }

    @Override
    public void createWalls() {
        walls = "Rafshan walls";
    }

    @Override
    public void createRoof() {
        roof = " Rafshan roof";
    }

    @Override
    public String getResult() {
        return basement + " " + walls + " " + roof;
    }
}
