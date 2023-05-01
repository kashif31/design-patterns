package com.kashtech.designpatterns.observer;

public interface Subject {
    void subscribe(Subscriber subscriber);

    void unsubscribe(Subscriber subscriber);

    void notifySubscribers();

    void uploadNewVideo(String title);
}
