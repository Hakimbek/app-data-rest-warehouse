package uz.pdp.appdatarestwarehouse.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Output {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "date bo'lishi kerak")
    private Date date;

    @ManyToOne(optional = false)
    private Warehouse warehouse;

    @ManyToOne(optional = false)
    private Currency currency;

    @ManyToOne(optional = false)
    private Client client;

    @NotNull(message = "factureNumber bo'lishi kerak")
    private String factureNumber;

    @NotNull(message = "code bo'lishi kerak")
    private String code;
}
