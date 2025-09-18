package com.example.interviews.designpatterns.behavioral.observer;

public class Main {

    public static void main(String[] args) {

        var alice = new User("Alice", "alice@gmail.com");
        var bob = new User("Bob", "bob@gmail.com");
        var john = new User("John", "john@gmail.com");

        var channel1 = new YoutubeChannel();
        var channel2 = new YoutubeChannel();

        channel1.subscribe(alice);
        channel1.subscribe(john);
        channel2.subscribe(bob);

        System.out.println("Uploading Video 1 on Channel 1");
        channel1.uploadVideo();

        System.out.println("Uploading Video 1 on Channel 2");
        channel2.uploadVideo();

        System.out.println("Unsubscribing Alice from Channel 1");
        channel1.unsubscribe(alice);

        System.out.println("Uploading Video 2 on Channel 1");
        channel1.uploadVideo();
    }
}
