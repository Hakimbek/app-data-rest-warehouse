package uz.pdp.appdatarestwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdatarestwarehouse.entity.Measurement;

@Projection(name = "measurementProjection", types = Measurement.class)
public interface MeasurementProjection {
    Integer getId();

    String getName();

    Boolean getActive();
}
