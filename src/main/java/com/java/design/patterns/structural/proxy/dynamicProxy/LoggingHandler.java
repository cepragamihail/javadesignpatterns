package com.java.design.patterns.structural.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class LoggingHandler implements InvocationHandler {
    private final Object target;
    private Map<String, Integer> calls = new HashMap<>();
    public LoggingHandler(Object target) {
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        if (calls.containsKey("toString")) {
            return calls.toString();
        } 
        calls.merge(methodName, 1, Integer::sum);
        return method.invoke(target, args);
    }
}
