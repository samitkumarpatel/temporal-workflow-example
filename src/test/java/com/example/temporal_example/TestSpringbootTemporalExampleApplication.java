package com.example.temporal_example;

import org.springframework.boot.SpringApplication;

public class TestSpringbootTemporalExampleApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringbootTemporalExampleApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
