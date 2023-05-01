package com.kashtech.designpatterns.strategy;

import com.kashtech.designpatterns.observer.Channel;
import com.kashtech.designpatterns.observer.Subscriber;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ObserverPatternTests {

    Channel channel = new Channel();
    Subscriber s1 = new Subscriber("Ali");
    Subscriber s2 = new Subscriber("Atif");

    Subscriber s3 = new Subscriber("Ahmed");

    @Test
    public void shouldSubscribeNewChannel(){
        s1.subscribeChannel(channel);
        s2.subscribeChannel(channel);
        s3.subscribeChannel(channel);
        assertEquals("Test", channel.getChannelName());
    }

    @Test
    public void shouldAddNewSubscriber(){
        channel.subscribe(s1);
        channel.subscribe(s2);
        channel.subscribe(s3);
        assertEquals(3, channel.getSubscriberList().size());
    }

    @Test
    public void shouldNotifySubscribers(){
        channel.uploadNewVideo("How to program");
    }

    @Test
    public void shouldUnSubscribeNewChannel(){
        channel.unsubscribe(s3);
        channel.uploadNewVideo("How to program");
    }
}
