package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApplicationProperties {

    private final String name;

    private final boolean productionModeEnabled;

    private final WebProperties webProperties;

    @Autowired
    public ApplicationProperties(@Value("${app.name}") String name,
                                 @Value("${app.production.mode.enabled:false}") boolean productionModeEnabled,
                                 WebProperties webProperties) {
        this.name = name;
        this.productionModeEnabled = productionModeEnabled;
        this.webProperties = webProperties;
    }

    public String getName() {
        return name;
    }

    public boolean isProductionModeEnabled() {
        return productionModeEnabled;
    }

    public WebProperties getWebProperties() {
        return webProperties;
    }

}
