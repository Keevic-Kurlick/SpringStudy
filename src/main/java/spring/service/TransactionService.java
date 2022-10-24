package spring.service;

import org.springframework.stereotype.Service;
import spring.dto.TransactionDto;

import java.time.LocalDate;
import java.util.List;

@Service
public interface TransactionService {
    List<TransactionDto> getAll();

    List<TransactionDto> getByPeriod(LocalDate start, LocalDate end);

    List<TransactionDto> getIncomes();

    List<TransactionDto> getExpense();

    TransactionDto findById(long id);

    void save(TransactionDto dto);

    void deleteById(long id);

}
