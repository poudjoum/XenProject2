package com.jumpy.XenProjet;

//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
//import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class XenProjetApplication extends SpringBootServletInitializer{
	//private IXenProjetInitService xenProjetService;

	public static void main(String[] args) {
		SpringApplication.run(XenProjetApplication.class, args);
	}

}
