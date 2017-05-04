package decorator;

/**
 * Created by Di on 04.05.2017.
 */
public class SMSTariff extends TariffDecorator
{

    public SMSTariff(CountTariffInterface tariff) {
        super(tariff);
    }

    @Override
    public void processTariff() {
        System.out.println("you have 100 sms.");
        super.processTariff();
    }
}
