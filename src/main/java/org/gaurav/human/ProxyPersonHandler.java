package org.gaurav.human;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public record ProxyPersonHandler(Person target) implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        IO.println("Hi! I am Proxy");
        return method.invoke(target, args);
    }
}
