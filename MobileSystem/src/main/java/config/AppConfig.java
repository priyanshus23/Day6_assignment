package config;

import javax.sql.DataSource;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
@ComponentScan("mobile")
public class AppConfig {

	@Bean
	DataSource dataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/mobile");
		driverManagerDataSource.setUsername("priyanshu");
		driverManagerDataSource.setPassword("Pashu@1998");
		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return driverManagerDataSource;
		
	}
}