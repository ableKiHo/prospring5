package com.apress.prospring5.ch2.decoupled;

public class HelloWorldDecoupledWithFctory {
    public static void main(String[] args) {
        MessageRenderer mr = MessageSupportFactory.getInstance().getMessageRenderer();
        MessageProvider mp = MessageSupportFactory.getInstance().getMEssageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
