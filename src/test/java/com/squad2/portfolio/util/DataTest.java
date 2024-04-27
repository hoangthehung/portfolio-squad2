package com.squad2.portfolio.util;

import com.squad2.portfolio.entity.PortfolioEntity;
import com.squad2.portfolio.model.InvestmentStrategy;
import com.squad2.portfolio.model.Portfolio;

import java.math.BigDecimal;

public class DataTest {
    public static Portfolio getPortfolio() {
        Portfolio portfolio = new Portfolio();
        portfolio.setPortfolioId(1);
        portfolio.setPortfolioNumber("123");
        portfolio.setPortfolioValue(new BigDecimal("123.456"));
        portfolio.setCustomerId(123);
        portfolio.setCustomerName("test");
        portfolio.setCurrentPerformance(45.6);
        portfolio.setInvestmentStrategy(InvestmentStrategy.MODERATE);
        return portfolio;
    }
    public static PortfolioEntity getPortfolioEntity() {
        PortfolioEntity portfolio = new PortfolioEntity();
        portfolio.setPortfolioId(1);
        portfolio.setPortfolioNumber("123");
        portfolio.setPortfolioValue(new BigDecimal("123.456"));
        portfolio.setCustomerId(123);
        portfolio.setCustomerName("test");
        portfolio.setCurrentPerformance(45.6);
        portfolio.setInvestmentStrategy(InvestmentStrategy.MODERATE);
        return portfolio;
    }
}
