package com.pluralsight;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class PsSpringCloudTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(PsSpringCloudTaskApplication.class, args);
	}
	
	@Bean
	public TollProcessingTask tollProcessingTask() {
		return new TollProcessingTask();
	}
	
	public class TollProcessingTask implements CommandLineRunner {
		@Override
		public void run(String... strings) throws Exception {
			if(null != strings) {
				System.out.println("Parameter length is " + strings.length + " its first string is: " + strings[0]);
			}
		}
	}
}
