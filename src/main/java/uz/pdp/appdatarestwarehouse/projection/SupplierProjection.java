package uz.pdp.appdatarestwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdatarestwarehouse.entity.Supplier;

@Projection(name = "supplierProjection", types = Supplier.class)
public interface SupplierProjection {
    Integer getId();

    String getName();

    String getPhoneNumber();

    Boolean getActive();
}
