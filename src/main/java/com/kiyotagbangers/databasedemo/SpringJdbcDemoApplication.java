package com.kiyotagbangers.databasedemo;

import com.kiyotagbangers.databasedemo.entity.Person;
import com.kiyotagbangers.databasedemo.jdbc.PersonJdbcDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

// @SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJdbcDAO dao;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All users -> {}", dao.findAll());
		logger.info("User id 1001 -> {}", dao.findById(10001));
		logger.info("Deleting id 1002 -> No of Rows Deleted - {}", dao.deleteById(10002));
		logger.info("Inserting 1004 -> {}", dao.insert(new Person(10004, "Takahashi", "Fukuoka", new Date())));
		logger.info("Updating 1003 -> {}", dao.update(new Person(10003, "John", "Berlin", new Date())));
		logger.info("All users -> {}", dao.findAll());
	}
}
