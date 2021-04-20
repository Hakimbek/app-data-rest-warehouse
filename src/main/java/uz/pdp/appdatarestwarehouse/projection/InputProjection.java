package uz.pdp.appdatarestwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdatarestwarehouse.entity.*;

@Projection(name = "inputProjection", types = Input.class)
public interface InputProjection {
    Integer getId();

    String getDate();

    Currency getCurrency();

    String getCode();

    String getFactureNumber();

    Warehouse getWarehouse();

    Supplier getSupplier();
}
