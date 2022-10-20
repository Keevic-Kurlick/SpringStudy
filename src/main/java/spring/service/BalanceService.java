package spring.service;

import spring.dto.BalanceDto;

import java.time.LocalDate;

public interface BalanceService {
    BalanceDto getBalance();

    BalanceDto getBalanceByDate(LocalDate date);

}
