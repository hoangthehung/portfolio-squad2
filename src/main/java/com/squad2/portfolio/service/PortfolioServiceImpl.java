package com.squad2.portfolio.service;

import com.squad2.portfolio.exception.ErrorCode;
import com.squad2.portfolio.exception.PortfolioException;
import com.squad2.portfolio.mapper.InternalMapper;
import com.squad2.portfolio.model.Portfolio;
import com.squad2.portfolio.repository.PortfolioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PortfolioServiceImpl implements PortfolioService{
    final PortfolioRepository portfolioRepository;
    final InternalMapper internalMapper;
    @Override
    public Portfolio getPortfolioById(Integer portfolio) {
        return portfolioRepository.findById(portfolio)
                .map(internalMapper::toPortfolio)
                .orElseThrow(() -> new PortfolioException(ErrorCode.PORTFOLIO_NOT_FOUND));
    }
}
