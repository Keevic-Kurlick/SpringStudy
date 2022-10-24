package spring.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDto {
    private Long id;
    private LocalDate date;
    private boolean expense;
    private String title;
    private double sum;
    private double flow;

    public TransactionDto(LocalDate date, boolean expense, String title, double sum) {
        this.date = date;
        this.expense = expense;
        this.title = title;
        this.sum = sum;
        this.flow = expense ? -sum : sum;
    }
}
