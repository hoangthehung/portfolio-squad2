package com.squad2.portfolio.controller;

import com.squad2.portfolio.model.Portfolio;
import com.squad2.portfolio.service.PortfolioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/portfolios")
@RequiredArgsConstructor
public class PortfolioController {
    final PortfolioService portfolioService;
//    @PreAuthorize("hasRole('ROLE_CUSTOMER')")
    @GetMapping("/{id}")
    public Portfolio getById(@PathVariable("id") Integer portfolioId) {
        return portfolioService.getPortfolioById(portfolioId);
    }
}
