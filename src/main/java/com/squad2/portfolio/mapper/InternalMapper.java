package com.squad2.portfolio.mapper;


import com.squad2.portfolio.entity.PortfolioEntity;
import com.squad2.portfolio.model.Portfolio;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface InternalMapper {
    @Mapping(target = "portfolioId", source = "portfolioId")
    @Mapping(target = "customerId", source = "customerId")
    @Mapping(target = "customerName", source = "customerName")
    @Mapping(target = "portfolioNumber", source = "portfolioNumber")
    @Mapping(target = "portfolioValue", source = "portfolioValue")
    @Mapping(target = "currentPerformance", source = "currentPerformance")
    @Mapping(target = "investmentStrategy", source = "investmentStrategy")
    Portfolio toPortfolio(PortfolioEntity entity);
}
