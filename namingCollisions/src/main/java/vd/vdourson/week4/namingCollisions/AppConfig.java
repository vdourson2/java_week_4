package vd.vdourson.week4.namingCollisions;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public CommandInterface getSayHello() {
		return new SayHello();
	}
	
	@Bean
	public CommandInterface getGetTime() {
		return new GetTime();
	}
}
