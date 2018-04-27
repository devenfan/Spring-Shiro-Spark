package com.zhuxs.result;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication
public class ResultApplication {

	public static void main(String[] args) {
		System.setProperty("spark.executor.memory","512m");
		SpringApplication.run(ResultApplication.class, args);
	}

}

