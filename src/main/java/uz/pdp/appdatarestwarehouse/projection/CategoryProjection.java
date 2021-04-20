package uz.pdp.appdatarestwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdatarestwarehouse.entity.Category;

@Projection(name = "categoryProjection", types = Category.class)
public interface CategoryProjection {
    Integer getId();

    Category getParentCategory();

    Boolean getActive();
}
