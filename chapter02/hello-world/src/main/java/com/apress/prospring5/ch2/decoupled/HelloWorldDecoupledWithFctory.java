package com.apress.prospring5.ch2.decoupled;

public class HelloWorldDecoupledWithFctory {
    public static void main(String[] args) {
        MessageRenderer mr = MessageSupportFactory.getInstance().getRenderer();
        MessageProvider mp = MessageSupportFactory.getInstance().getProvider();
        mr.setMessageProvidr(mp);
        mr.render();
    }
}
