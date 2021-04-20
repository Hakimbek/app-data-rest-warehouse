package uz.pdp.appdatarestwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdatarestwarehouse.entity.Warehouse;

@Projection(name = "warehouseProjection", types = Warehouse.class)
public interface WarehouseProjection {
    Integer getId();

    String getName();

    Boolean getActive();
}
