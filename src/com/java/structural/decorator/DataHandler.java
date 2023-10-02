package com.java.structural.decorator;

abstract public class DataHandler implements DatabaseManager {
    protected DatabaseManager dbm;

    abstract public void Read(BufferData data);
    abstract public void Write(BufferData data);
}
