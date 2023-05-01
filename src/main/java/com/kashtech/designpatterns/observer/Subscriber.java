package com.kashtech.designpatterns.observer;

public class Subscriber implements Observer {

    private String name;
    private Channel channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(){
        System.out.println("A new video uploaded");
    }

    @Override
    public void subscribeChannel(Channel channel){
        this.channel = channel;
    }
}
