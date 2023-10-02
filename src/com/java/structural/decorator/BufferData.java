package com.java.structural.decorator;

public class BufferData {
    private String data;

    public BufferData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data;
    }
}
