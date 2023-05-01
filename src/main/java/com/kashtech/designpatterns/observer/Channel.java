package com.kashtech.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    private String channelName = "Test";
    private String videoTitle;
    private List<Subscriber> subscriberList = new ArrayList<>();

    public String getChannelName() {
        return channelName;
    }

    public List<Subscriber> getSubscriberList() {
        return subscriberList;
    }

    @Override
    public void subscribe(Subscriber subscriber){
        subscriberList.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber){
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifySubscribers(){
        for(Subscriber sub : subscriberList){
            sub.update();
        }
    }

    @Override
    public void uploadNewVideo(String title){
        this.videoTitle = title;
        notifySubscribers();
    }
}
