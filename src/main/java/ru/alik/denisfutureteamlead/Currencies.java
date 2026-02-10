package ru.alik.denisfutureteamlead;

import java.util.ArrayList;

public enum Currencies {
    RUB("RUB"),
    USD("USD"),
    EUR("EUR"),
    CNY("CNY");
    private final String code;

    Currencies(String code) {
        this.code = code;
    }
    public String getCode() {
        return code;
    }
    public static ArrayList<String> getCurrencies() {
        ArrayList<String> currencies = new ArrayList<>();
        currencies.add(RUB.getCode());
        currencies.add(USD.getCode());
        currencies.add(EUR.getCode());
        currencies.add(CNY.getCode());
        return currencies;

        // тест пр 2
        // тест пр 2
        // тест пр 2
        // тест пр 2
    }
}
