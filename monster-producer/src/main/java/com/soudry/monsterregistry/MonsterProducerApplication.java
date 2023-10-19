package com.soudry.monsterregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDiscoveryClient
public class MonsterProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonsterRegistryApplication.class, args);
	}

}
