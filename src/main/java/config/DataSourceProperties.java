package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DataSourceProperties {

    private final String driver;
    private final String url;
    private final String username;
    private final String password;

    @Autowired
    public DataSourceProperties(@Value("${jdbc.driverClassName}") String driver,
                                @Value("${jdbc.url}") String url,
                                @Value("${jdbc.username}") String username,
                                @Value("${jdbc.password}") String password) {
        this.driver = driver;
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public String getDriver() {
        return driver;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
