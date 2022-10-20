package spring.service;

import spring.dto.TransactionDto;

import java.time.LocalDate;
import java.util.List;

public interface TransactionService {
    List<TransactionDto> getAll();

    List<TransactionDto> getByPeriod(LocalDate start, LocalDate end);

    List<TransactionDto> getIncomes();

    List<TransactionDto> getExpense();

    TransactionDto findById(long id);

    void save(TransactionDto dto);

    void deleteById(long id);

}
