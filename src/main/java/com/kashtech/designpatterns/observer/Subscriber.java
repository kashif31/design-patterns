package com.kashtech.designpatterns.observer;

public class Subscriber {

    private String name;
    private Channel channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(){
        System.out.println("A new video uploaded");
    }

    public void subscribeChannel(Channel channel){
        this.channel = channel;
    }
}
