package uz.pdp.appdatarestwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdatarestwarehouse.entity.*;

@Projection(name = "outputProjection", types = Output.class)
public interface OutputProjection {
    Integer getId();

    String getDate();

    Currency getCurrency();

    String getCode();

    String getFactureNumber();

    Warehouse getWarehouse();

    Supplier getSupplier();
}
