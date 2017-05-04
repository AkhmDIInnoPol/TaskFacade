package decorator;

/**
 * Created by Di on 04.05.2017.
 */
public class RoamingTariff extends TariffDecorator
{

    public RoamingTariff(CountTariffInterface tariff) {
        super(tariff);

    }

    @Override
    public void processTariff() {
        System.out.println("You have 10 days in rouming.");
        super.processTariff();
    }
}
