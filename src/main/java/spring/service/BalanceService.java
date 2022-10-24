package spring.service;

import org.springframework.stereotype.Service;
import spring.dto.BalanceDto;

import java.time.LocalDate;

@Service
public interface BalanceService {
    BalanceDto getBalance();

    BalanceDto getBalanceByDate(LocalDate date);

}
