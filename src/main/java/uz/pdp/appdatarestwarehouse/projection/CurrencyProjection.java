package uz.pdp.appdatarestwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdatarestwarehouse.entity.Currency;

@Projection(name = "currencyProjection", types = Currency.class)
public interface CurrencyProjection {
    Integer getId();

    String getName();

    Boolean getActive();
}
