package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UrlBuilder {

    private final WebProperties properties;

    @Autowired
    public UrlBuilder(WebProperties properties) {
        this.properties = properties;
    }

}
