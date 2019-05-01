package com.visualizesoft.train;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrainApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainApplication.class, args);
		int count = 0;
		try {
		while (true) {
			System.out.println("Count is: " + count);
			count++;
			Thread.sleep(4000);
		}
		} catch (Exception ex) { 
			System.out.println("Exception - Count is : " + count);
		}
	}

}
