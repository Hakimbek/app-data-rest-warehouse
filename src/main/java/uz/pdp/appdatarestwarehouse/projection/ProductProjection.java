package uz.pdp.appdatarestwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdatarestwarehouse.entity.Attachment;
import uz.pdp.appdatarestwarehouse.entity.Category;
import uz.pdp.appdatarestwarehouse.entity.Measurement;
import uz.pdp.appdatarestwarehouse.entity.Product;

@Projection(name = "productProjection", types = Product.class)
public interface ProductProjection {
    Integer getId();

    Category getCategory();

    Measurement getMeasurement();

    Attachment getPhotoId();

    String getCode();

    Boolean getActive();
}
