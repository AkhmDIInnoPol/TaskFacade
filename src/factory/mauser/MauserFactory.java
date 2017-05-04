package factory.mauser;

import factory.*;
import factory.colt.ColtGun;
import factory.colt.ColtRevolver;
import factory.colt.ColtRifle;

/**
 * Created by Di on 03.05.2017.
 */
public class MauserFactory implements WeaponFactory
{

    @Override
    public Revolver createRevolver() {
        return new MauserRevolver();
    }

    @Override
    public Gun createGun() {
        return new MauserGun();
    }

    @Override
    public Rifle createRifle() {
        return new MauserRifle();
    }

    @Override
    public BFG createBFG() {
        return new MauserBFG();
    }
}
