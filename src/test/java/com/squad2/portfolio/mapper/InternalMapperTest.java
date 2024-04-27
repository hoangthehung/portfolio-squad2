package com.squad2.portfolio.mapper;

import com.squad2.portfolio.entity.PortfolioEntity;
import com.squad2.portfolio.model.InvestmentStrategy;
import com.squad2.portfolio.model.Portfolio;
import com.squad2.portfolio.util.DataTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
class InternalMapperTest {
    InternalMapper internalMapper = new InternalMapperImpl();

    @Test
    void toPortfolio() {
        Portfolio actual = internalMapper.toPortfolio(DataTest.getPortfolioEntity());
        assertEquals(1, actual.getPortfolioId());
        assertEquals("123", actual.getPortfolioNumber());
        assertEquals(new BigDecimal("123.456"), actual.getPortfolioValue());
        assertEquals(123, actual.getCustomerId());
        assertEquals("test", actual.getCustomerName());
        assertEquals(45.6, actual.getCurrentPerformance());
        assertEquals(InvestmentStrategy.MODERATE, actual.getInvestmentStrategy());

    }
}