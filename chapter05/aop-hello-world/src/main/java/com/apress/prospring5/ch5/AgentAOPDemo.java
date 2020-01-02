package com.apress.prospring5.ch5;

import org.springframework.aop.framework.ProxyFactory;

public class AgentAOPDemo {
    public static void main(String[] args) {
        Agent taget = new Agent();

        ProxyFactory pf = new ProxyFactory();
        pf.addAdvice(new AgentDecorator());
        pf.setTarget(taget);

        Agent proxy = (Agent) pf.getProxy();
        taget.speak();
        System.out.println("");
        proxy.speak();
    }
}
