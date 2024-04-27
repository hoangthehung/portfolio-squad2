package com.squad2.portfolio.service;

import com.squad2.portfolio.entity.PortfolioEntity;
import com.squad2.portfolio.mapper.InternalMapper;
import com.squad2.portfolio.mapper.InternalMapperImpl;
import com.squad2.portfolio.model.InvestmentStrategy;
import com.squad2.portfolio.model.Portfolio;
import com.squad2.portfolio.repository.PortfolioRepository;
import com.squad2.portfolio.util.DataTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
class PortfolioServiceImplTest {
    @Mock
    PortfolioRepository portfolioRepository;
    InternalMapper internalMapper = new InternalMapperImpl();
    PortfolioService portfolioService;
    @BeforeEach
    void init() {
        portfolioService = new PortfolioServiceImpl(portfolioRepository, internalMapper);
    }
    @Test
    void getPortfolioById() {
        Mockito.doReturn(Optional.of(DataTest.getPortfolioEntity())).when(portfolioRepository).findById(123);
        Portfolio actual = portfolioService.getPortfolioById(123);
        assertEquals(1, actual.getPortfolioId());
        assertEquals("123", actual.getPortfolioNumber());
        assertEquals(new BigDecimal("123.456"), actual.getPortfolioValue());
        assertEquals(123, actual.getCustomerId());
        assertEquals("test", actual.getCustomerName());
        assertEquals(45.6, actual.getCurrentPerformance());
        assertEquals(InvestmentStrategy.MODERATE, actual.getInvestmentStrategy());
    }
}