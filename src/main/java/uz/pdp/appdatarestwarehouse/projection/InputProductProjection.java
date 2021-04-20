package uz.pdp.appdatarestwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdatarestwarehouse.entity.*;

import java.util.Date;

@Projection(name = "inputProductProjection", types = InputProduct.class)
public interface InputProductProjection {
    Integer getId();

    Double getAmount();

    Double getPrice();

    Date getExpireDate();

    Input getInput();

    Product getProduct();
}
