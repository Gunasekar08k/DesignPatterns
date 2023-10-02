package com.java.structural.decorator;

public class DataEncryption extends DataHandler {
    public DataEncryption(DatabaseManager dbm) {
        super.dbm = dbm;
    }

    @Override
    public void Read(BufferData data) {
        super.dbm.Read(data);
        Decrypt(data);
    }

    @Override
    public void Write(BufferData data) {
        Encrypt(data);
        super.dbm.Write(data);
    }

    public void Encrypt(BufferData data) {
        System.out.println(data +" encrypted successfully");
    }

    public void Decrypt(BufferData data) {
    System.out.println(data +" decrypted successfully");
    }
}
