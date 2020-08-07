package com.nd2k.server_mongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class ServerMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerMongoApplication.class, args);
	}

}
