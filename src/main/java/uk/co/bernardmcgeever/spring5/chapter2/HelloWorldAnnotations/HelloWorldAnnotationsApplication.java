package uk.co.bernardmcgeever.spring5.chapter2.HelloWorldAnnotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class HelloWorldAnnotationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldAnnotationsApplication.class, args);

		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		MessageRenderer messageRenderer = ctx.getBean("renderer", MessageRenderer.class);

		messageRenderer.render();
	}
}
