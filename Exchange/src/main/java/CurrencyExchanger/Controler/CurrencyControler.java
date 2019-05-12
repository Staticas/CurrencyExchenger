package CurrencyExchanger.Controler;

import CurrencyExchanger.Entity.Currency;
import CurrencyExchanger.Service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/currencys")
public class CurrencyControler {

    @Autowired
    private CurrencyService currencyService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Currency> getAllCurrencys(){
        return currencyService.getAllCurrencys();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Currency getCurrencyBySing(@PathVariable("id") int id) {
        return currencyService.getCurrencyBySing(id);
    }
}
