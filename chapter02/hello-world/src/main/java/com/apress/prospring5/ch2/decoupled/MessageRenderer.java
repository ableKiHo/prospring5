package com.apress.prospring5.ch2.decoupled;

public interface MessageRenderer {
    void render();

    void setMessageProvidr(MessageProvider providr);

    MessageProvider getMessageProvider();
}
