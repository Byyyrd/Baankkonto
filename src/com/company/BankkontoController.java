package com.company;

public class BankkontoController {
    private Bankkonto bankkonto;
    public BankkontoController(Bankkonto pBankkonto) {
        bankkonto = pBankkonto;
    }

    public Bankkonto getBankkonto() {
        return bankkonto;
    }
    public void veraendereKontostand(double betrag){
        bankkonto.veraendereKontostand(betrag);
    }
}
