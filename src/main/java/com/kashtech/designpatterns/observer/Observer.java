package com.kashtech.designpatterns.observer;

public interface Observer {
    void update();

    void subscribeChannel(Channel channel);
}
