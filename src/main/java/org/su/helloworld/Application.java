package org.su.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        /*Engine engine = new PetrolEngine();
        Car car = new Car(engine);
        car.go();*/

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Car car = applicationContext.getBean("car", Car.class);
        car.go();
    }
}
