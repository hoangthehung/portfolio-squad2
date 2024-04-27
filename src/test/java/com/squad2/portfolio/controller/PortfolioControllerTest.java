package com.squad2.portfolio.controller;

import com.squad2.portfolio.model.Portfolio;
import com.squad2.portfolio.service.PortfolioService;
import com.squad2.portfolio.util.DataTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
class PortfolioControllerTest {

    @Mock
    PortfolioService portfolioService;

    @InjectMocks
    PortfolioController portfolioController;
    @Test
    void getById() {
        Portfolio portfolio = DataTest.getPortfolio();
        Integer id = 123;
        Mockito.doReturn(portfolio).when(portfolioService).getPortfolioById(id);
        Portfolio actual = portfolioController.getById(id);
        assertEquals(portfolio, actual);
    }
}