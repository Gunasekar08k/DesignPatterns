package com.java.structural.decorator;

public class DataCompress extends DataHandler {
    public DataCompress(DatabaseManager dbm) {
        super.dbm = dbm;
    }

    @Override
    public void Read(BufferData data) {
        super.dbm.Read(data);
        Decompress(data);
    }

    @Override
    public void Write(BufferData data) {
        Compress(data);
        super.dbm.Write(data);
    }

    public void Compress(BufferData data) {
        System.out.println(data +" compressed successfully");
    }

    public void Decompress(BufferData data) {
        System.out.println(data +" decompressed successfully");
    }
}
