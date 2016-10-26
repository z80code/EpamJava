package by.gsu.epamlab;

public class CurrencyByn {

    public int coins;

    public CurrencyByn() {
    }

    public CurrencyByn(int coins) {
        this.coins = coins;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public String show() {
        return String.format("%.2f", coins/100f);
    }

    @Override
    public String toString() {
        return String.format("%d", coins);
    }
}
