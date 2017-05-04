package factory.colt;

import factory.*;

/**
 * Created by Di on 03.05.2017.
 */
public class ColtFactory implements WeaponFactory
{

    @Override
    public Revolver createRevolver() {
        return new ColtRevolver();
    }

    @Override
    public Gun createGun() {
        return new ColtGun();
    }

    @Override
    public Rifle createRifle() {
        return new ColtRifle();
    }

    @Override
    public BFG createBFG() {
        return new ColtBFG();
    }
}
