package org.gaurav;

import org.gaurav.human.Man;
import org.gaurav.human.Person;
import org.gaurav.human.ProxyPersonHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Proxy;

@SpringBootApplication
public class Main {
    static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        Man man = new Man();
        ClassLoader manClassLoader = man.getClass().getClassLoader();
        Class<?>[] manInterfaces = man.getClass().getInterfaces();
        Person newProxyInstance = (Person) Proxy.newProxyInstance(manClassLoader, manInterfaces, new ProxyPersonHandler(man));
        newProxyInstance.work("10");
    }
}
