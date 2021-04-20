package uz.pdp.appdatarestwarehouse.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OutputProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "amount bo'lishi kerak")
    private Double amount;

    @NotNull(message = "price bo'lishi kerak")
    private Double price;

    @ManyToOne(optional = false)
    private Product product;

    @ManyToOne(optional = false)
    private Output output;
}
