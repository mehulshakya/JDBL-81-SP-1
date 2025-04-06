package org.geeksforgeeks.gfg_spring_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class GfgSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(GfgSpringApplication.class, args);
	}

}
