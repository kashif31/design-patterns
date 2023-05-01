package com.kashtech.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private String channelName = "Test";
    private String videoTitle;
    private List<Subscriber> subscriberList = new ArrayList<>();

    public String getChannelName() {
        return channelName;
    }

    public List<Subscriber> getSubscriberList() {
        return subscriberList;
    }

    public void subscribe(Subscriber subscriber){
        subscriberList.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber){
        subscriberList.remove(subscriber);
    }

    public void notifySubscribers(){
        for(Subscriber sub : subscriberList){
            sub.update();
        }
    }

    public void uploadNewVideo(String title){
        this.videoTitle = title;
        notifySubscribers();
    }
}
