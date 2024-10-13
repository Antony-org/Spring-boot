package org.example.springbootcourse;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource dataSource() {
        System.out.println("inside DataSourceConfig -----------------------------------");
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/spring");
        dataSource.setUsername("root");

        dataSource.setMaximumPoolSize(10);
        dataSource.setMinimumIdle(5);

        return dataSource;
    }
}