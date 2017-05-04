package factory;

/**
 * Created by Di on 03.05.2017.
 */
public interface WeaponFactory
{
    Revolver createRevolver();
    Gun createGun();
    Rifle createRifle();

    BFG createBFG();



}
