package config;

import model.DataSourceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {

    @Bean
    public DataSourceBean dataSourceBean() {
        return new DataSourceBean();
    }

}
