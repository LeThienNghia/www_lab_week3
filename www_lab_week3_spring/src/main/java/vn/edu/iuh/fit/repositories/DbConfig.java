package vn.edu.iuh.fit.repositories;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@EnableJdbcRepositories(basePackages = {"vn.edu.iuh.fit.repositories"})
@EntityScan(basePackages = {"vn.edu.iuh.fit.entities"})
public class DbConfig {
    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.mariadb.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("sapassword");
        dataSource.setUrl("jdbc:mariadb://localhost:3306/sampledb?createDatabaseIfNotExist=true");
        return dataSource;
    }
}
