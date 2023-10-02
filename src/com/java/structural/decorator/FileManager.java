package com.java.structural.decorator;

public class FileManager implements DatabaseManager {
    @Override
    public void Read(BufferData data) {
        System.out.println("Read data from file");
    }

    @Override
    public void Write(BufferData data) {
        System.out.println("Data : "+ data +" written into file successfully");
    }
}
