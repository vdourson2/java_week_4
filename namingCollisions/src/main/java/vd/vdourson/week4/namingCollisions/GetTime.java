package vd.vdourson.week4.namingCollisions;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

@Component
public class GetTime implements CommandInterface {

	@Override
	public void execute() {
		LocalTime time = LocalTime.now();
		DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println("Current time is : " + time.format(formatTime));
	}

}
