package com.canvas.www;


import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.sql.DataSource;

@SpringBootApplication
public class CanvasApplication implements WebMvcConfigurer {

    @Value("${spring.datasource.url}")
    String datasourceurl;

    @Value("${spring.datasource.username}")
    String username;

    @Value("{spring.datasource.password}")
    String pasword;



    public static void main(String[] args)  {
		SpringApplication.run(CanvasApplication.class, args);
	}


    @Bean
    public DataSource dataSource(){
        MysqlDataSource mysqlDataSource = new MysqlDataSource();
        mysqlDataSource.setURL(datasourceurl);
        mysqlDataSource.setUser("root");
        mysqlDataSource.setPassword("root");

        return mysqlDataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }
}
