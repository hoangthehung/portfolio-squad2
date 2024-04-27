package com.squad2.portfolio.entity;

import com.squad2.portfolio.model.InvestmentStrategy;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@Entity
@Table(name = "squad2_portfolio")
@Data
@EqualsAndHashCode
public class PortfolioEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "portfolio_id")
    Integer portfolioId;

    @Column(name = "customer_id")
    Integer customerId;

    @Column(name = "customer_name")
    String customerName;

    @Column(name = "portfolio_number")
    String portfolioNumber;

    @Column(name = "portfolio_value")
    BigDecimal portfolioValue;

    @Column(name = "current_performance")
    Double currentPerformance;

    @Column(name = "investment_strategy")
    @Enumerated(EnumType.STRING)
    InvestmentStrategy investmentStrategy;

}
