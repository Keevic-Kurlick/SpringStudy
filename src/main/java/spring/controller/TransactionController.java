package spring.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import spring.dto.TransactionDto;
import spring.service.TransactionService;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("api/transactions")
@RequiredArgsConstructor
public class TransactionController {
    private final TransactionService service;

    @GetMapping
    public List<TransactionDto> getList() {
        return service.getAll();
    }

    /* http://localhost:8080/transactions?start=2020-01-11&end=2020-01-20 */
    @GetMapping(params = {"start", "end"})
    public List<TransactionDto> getByPeriod(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate start,
                                            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate end) {
        return service.getByPeriod(start, end);
    }

    /* http://localhost:8080/transactions/1 */
    @GetMapping("incomes")
    public List<TransactionDto> getIncomes() {
        return service.getIncomes();
    }

    @GetMapping("expenses")
    public List<TransactionDto> getExpenses() {
        return service.getExpense();
    }

    @GetMapping("{id}")
    public TransactionDto getTransaction(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    public void addTransaction(@RequestBody TransactionDto dto) {
        service.save(dto);
    }

    @PutMapping("{id}")
    public void updateTransaction(@PathVariable long id, @RequestBody TransactionDto dto) {
        dto.setId(id);
        service.save(dto);
    }

    @DeleteMapping("{id}")
    public void deleteTransaction(@PathVariable long id) {
        service.deleteById(id);
    }
}
