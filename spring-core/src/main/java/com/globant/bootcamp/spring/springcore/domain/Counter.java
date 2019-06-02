package com.globant.bootcamp.spring.springcore.domain;


public class Counter {
    private int count;
    private final String message;
    
    public Counter(final int count, final String message) {
        this.count = count;
        this.message = message;
    }

    public int getCount() {
        return count;
    }

    public void setCount(final int count) {
        this.count = count;
    }

    public String getMessage() {
        return message;
    }

}
