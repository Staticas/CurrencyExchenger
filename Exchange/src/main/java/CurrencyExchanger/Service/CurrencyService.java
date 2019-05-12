package CurrencyExchanger.Service;

import CurrencyExchanger.Dao.CurrencyDao;
import CurrencyExchanger.Entity.Currency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CurrencyService {

    @Autowired
    private CurrencyDao currencyDao;

    public Collection<Currency> getAllCurrencys(){
        return this.currencyDao.getAllCurrencys();
    }

    public Currency getCurrencyBySing(int id){
        return this.currencyDao.getCurrencyBySing(id);
    }
}
