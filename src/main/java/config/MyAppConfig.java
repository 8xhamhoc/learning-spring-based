package config;

import model.Client;
import model.DataSourceBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfig {

    @Autowired
    private DataSourceBean dataSourceBean;

    @Bean
    public Client client() {
        return new Client(dataSourceBean);
    }

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyAppConfig.class, DataSourceConfig.class);
        Client client = context.getBean(Client.class);
        client.showData();

    }

}
