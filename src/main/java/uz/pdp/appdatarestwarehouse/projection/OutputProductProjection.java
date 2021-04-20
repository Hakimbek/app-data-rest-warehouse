package uz.pdp.appdatarestwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdatarestwarehouse.entity.Input;
import uz.pdp.appdatarestwarehouse.entity.InputProduct;
import uz.pdp.appdatarestwarehouse.entity.OutputProduct;
import uz.pdp.appdatarestwarehouse.entity.Product;

import java.util.Date;

@Projection(name = "outputProductProjection", types = OutputProduct.class)
public interface OutputProductProjection {
    Integer getId();

    Double getAmount();

    Double getPrice();

    Input getInput();

    Product getProduct();
}
