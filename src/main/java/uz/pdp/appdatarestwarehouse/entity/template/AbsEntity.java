package uz.pdp.appdatarestwarehouse.entity.template;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@MappedSuperclass
@Data
public abstract class AbsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "name berish kerak")
    private String name;

    @NotNull(message = "active berish kerak")
    private Boolean active = true;
}
