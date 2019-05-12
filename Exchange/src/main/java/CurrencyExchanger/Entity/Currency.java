package CurrencyExchanger.Entity;

public class Currency {
    private int id;
    private String CurrencySign;
    private Double sum;

    public Currency(int id, String currencySign, Double sum) {
        this.id = id;
        CurrencySign = currencySign;
        this.sum = sum;

    }

    public Currency() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurrencySign() {
        return CurrencySign;
    }

    public void setCurrencySign(String currencySign) {
        CurrencySign = currencySign;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

}
