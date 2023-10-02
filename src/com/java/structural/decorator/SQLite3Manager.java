package com.java.structural.decorator;

public class SQLite3Manager implements DatabaseManager {
    @Override
    public void Read(BufferData data) {
        System.out.println("Data read from SQLite3 DB");
    }

    @Override
    public void Write(BufferData data) {
        System.out.println("Data : "+ data +" written into SQLite3 successfully");
    }
}
