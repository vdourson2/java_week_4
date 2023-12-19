package vd.vdourson.week4.helloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import vd.vdourson.week4.helloWorld.service.HelloWorldService;

public class App 
{
    public static void main( String[] args )
    {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    HelloWorldService helloWorld = context.getBean(HelloWorldService.class);
    System.out.println(helloWorld.hello());
    }
}
