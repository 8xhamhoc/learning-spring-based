package config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public String something() {
        return new String(String.valueOf(System.nanoTime()));
    }

    public static void main(String... strings) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        System.out.println("Spring container started and is ready");
        SpringConfig bean = context.getBean(SpringConfig.class);
        System.out.println(bean.something());
        System.out.println(bean.something());
    }

}
