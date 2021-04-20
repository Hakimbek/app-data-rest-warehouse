package uz.pdp.appdatarestwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdatarestwarehouse.entity.Client;

@Projection(name = "clientProjection", types = Client.class)
public interface ClientProjection {
    Integer getId();

    String getName();

    String getPhoneNumber();

    Boolean getActive();
}
