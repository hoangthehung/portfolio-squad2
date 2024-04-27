package com.squad2.portfolio.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@Data
@EqualsAndHashCode
public class Portfolio {

    Integer portfolioId;

    Integer customerId;

    String customerName;

    String portfolioNumber;

    BigDecimal portfolioValue;

    Double currentPerformance;

    InvestmentStrategy investmentStrategy;

}
