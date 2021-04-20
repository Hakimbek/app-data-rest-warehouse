package uz.pdp.appdatarestwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdatarestwarehouse.entity.Client;
import uz.pdp.appdatarestwarehouse.entity.User;
import uz.pdp.appdatarestwarehouse.entity.Warehouse;

@Projection(name = "userProjection", types = User.class)
public interface UserProjection {
    Integer getId();

    String getFirstName();

    String getLastName();

    String getPhoneNumber();

    String getCode();

    String getPassword();

    Warehouse getWarehouse();

    Boolean getActive();
}
