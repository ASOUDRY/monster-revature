package com.soudry.monsterregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MonsterRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonsterRegistryApplication.class, args);
	}

}
