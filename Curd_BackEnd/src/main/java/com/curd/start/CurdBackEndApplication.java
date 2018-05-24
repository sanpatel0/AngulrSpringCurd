package com.curd.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.curd.model.User;
import com.curd.repository.UserRepository;

@SpringBootApplication
@ComponentScan({"com.curd.usercontroller"})
@EntityScan("com.curd.model")
@EnableJpaRepositories("com.curd.repository")
public class CurdBackEndApplication implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CurdBackEndApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		 
		
	}
}
