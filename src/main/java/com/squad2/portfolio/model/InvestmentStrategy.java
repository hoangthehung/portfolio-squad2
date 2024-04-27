package com.squad2.portfolio.model;

public enum InvestmentStrategy {
    SAFE("Safe"),
    MODERATE("Moderate"),
    RISKY("Risky")
    ;
    String value;
    InvestmentStrategy(String value) {
        this.value = value;
    }
}
