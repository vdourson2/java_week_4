package vd.vdourson.week4.namingCollisions;

import org.springframework.stereotype.Component;


public class SayHello implements CommandInterface {

	@Override
	public void execute() {
		System.out.println("Hello world");
	}

}
