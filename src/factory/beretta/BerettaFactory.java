package factory.beretta;

import factory.*;
import factory.colt.ColtGun;
import factory.colt.ColtRevolver;
import factory.colt.ColtRifle;

/**
 * Created by Di on 03.05.2017.
 */
public class BerettaFactory implements WeaponFactory
{

    @Override
    public Revolver createRevolver() {
        return new BerettaRevolver();
    }

    @Override
    public Gun createGun() {
        return new BerettaGun();
    }

    @Override
    public Rifle createRifle() {
        return new BerettaRifle();
    }

    @Override
    public BFG createBFG() {
        return new BerettaBFG();
    }
}
