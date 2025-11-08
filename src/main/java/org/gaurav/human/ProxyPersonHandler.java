package org.gaurav.human;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyPersonHandler implements InvocationHandler {
    private final Person target;

    public ProxyPersonHandler(Person target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        IO.println("Hi! I am Proxy");
        return method.invoke(target, args);
    }
}
