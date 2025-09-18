package com.example.interviews.designpatterns.behavioral.chainofresponsibility;

public abstract class SupportDesk {

    protected SupportDesk nextSupportDesk;

    public void setNextSupportDesk(SupportDesk nextSupportDesk) {
        this.nextSupportDesk = nextSupportDesk;
    }

    public abstract void handleRequest(String issue);
}
