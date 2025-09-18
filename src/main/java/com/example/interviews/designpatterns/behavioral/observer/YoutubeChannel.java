package com.example.interviews.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel {

    private final List<User> subscribers;

    public YoutubeChannel() {
        subscribers = new ArrayList<>();
    }

    public void subscribe(User user) {
        subscribers.add(user);
    }

    public void unsubscribe(User user) {
        subscribers.remove(user);
    }

    public void uploadVideo() {
        System.out.println("Uploading video...");
        notifySubscribers();
    }

    private void notifySubscribers() {
        System.out.println("Notifying subscribers...");

        for (var user: subscribers) {
            System.out.println("Notifying: " + user.email());
        }
    }
}
