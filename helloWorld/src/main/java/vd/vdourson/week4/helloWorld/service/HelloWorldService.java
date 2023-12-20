package vd.vdourson.week4.helloWorld.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

/* Class that reads the configuration property to determine the language of the hello message. */
@Service
@PropertySource("classpath:application.properties")
public class HelloWorldService implements EnvironmentAware {
	
	@Value("${configured_language}")
	private String language;
	@Autowired
	private Environment environment;
	
	/* Retrieve the appropriate hello message from the property file*/
	public String hello() {
		String property = this.language + "_hello_world";
		String msg = this.environment.getProperty(property);
		return msg;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Environment getEnvironment() {
		return environment;
	}

	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}	
}
