package vd.vdourson.week4.namingCollisions;

import org.springframework.stereotype.Component;

@Component
public class SayHello implements CommandInterface {

	//this method prints "hello world"
	@Override
	public void execute() {
		System.out.println("Hello world");
	}

}
