package uz.pdp.appdatarestwarehouse.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "firstName bo'lishi kerak")
    private String firstName;

    private String lastName;

    @Column(unique = true)
    @NotNull(message = "phoneNumber bo'lishi kerak")
    private String phoneNumber;

    @NotNull(message = "code bo'lishi kerak")
    private String code;

    @NotNull(message = "password bo;lishi kerak")
    private String password;

    private boolean active = true;

    @ManyToMany
    private Set<Warehouse> warehouse;
}
