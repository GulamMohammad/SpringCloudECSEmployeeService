package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableEurekaClient - not required
public class SpringCloudEcsEmployeeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEcsEmployeeServiceApplication.class, args);
	}
}
