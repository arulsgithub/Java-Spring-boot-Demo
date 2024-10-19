package com.arulJD.DemoApp;

import com.arulJD.DemoApp.sub1.SpringComponent;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoAppApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext=SpringApplication.run(DemoAppApplication.class, args);
		SpringComponent springComponent = applicationContext.getBean(SpringComponent.class);
		System.out.println(springComponent.getMessage());
	}

}
