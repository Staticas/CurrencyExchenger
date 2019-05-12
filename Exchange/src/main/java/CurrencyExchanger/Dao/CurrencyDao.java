package CurrencyExchanger.Dao;

import CurrencyExchanger.Entity.Currency;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;

@Repository
public class CurrencyDao {
    private static HashMap<Integer, Currency> currencys;

    static{
        currencys = new HashMap<Integer, Currency>() {

            {
                put(1, new Currency(1, "EU", 3.45));
                put(2, new Currency(2, "Bucks", 4.45));
                put(3, new Currency(3, "GB", 6.32));
            }
         };
    }

    public Collection<Currency> getAllCurrencys(){
        return this.currencys.values();
    }

    public Currency getCurrencyBySing(int id){
        return this.currencys.get(id);
    }
}
