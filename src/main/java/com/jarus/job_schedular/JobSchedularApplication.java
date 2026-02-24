package com.jarus.job_schedular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JobSchedularApplication implements CommandLineRunner {

	@Autowired
	MessageSender messageSender;

	public static void main(String[] args) {
		SpringApplication.run(JobSchedularApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		messageSender.sendMessage();
	}
}
