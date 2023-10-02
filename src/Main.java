import com.java.structural.decorator.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Decorator Design Pattern");

        BufferData data = new BufferData("Password");

        DatabaseManager dbm = new SQLite3Manager();
        DataHandler dataHandler = new DataCompress(dbm);
        dataHandler = new DataEncryption(dataHandler);
        dataHandler.Write(data);

        BufferData readData = new BufferData("");
        DatabaseManager databaseManager = new FileManager();
        databaseManager = new DataCompress(databaseManager);
        databaseManager = new DataEncryption(databaseManager);
        databaseManager.Read(readData);
    }
}