package cl.jrios.conf;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("cl.jrios")
@PropertySource("classpath:database.properties")
public class AppConfig {

    @Autowired
    Environment environment;

    @Bean
    DataSource dataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        String url = environment.getProperty("url");
        String username = environment.getProperty("username");
        String dbpassword = environment.getProperty("dbpassword");
        String driverClassName = environment.getProperty("driverClassName");
        
        driverManagerDataSource.setUrl(url);
        driverManagerDataSource.setUsername(username);
        driverManagerDataSource.setPassword(dbpassword);
        driverManagerDataSource.setDriverClassName(driverClassName);

        return driverManagerDataSource;
    }
}