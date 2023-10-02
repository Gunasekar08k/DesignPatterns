import com.java.structural.decorator.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Decorator Design Pattern");

        /* Write the data to database with decorator functionalities */
        BufferData writeBuffer = new BufferData("Password");
        DatabaseManager writeData = new FileManager();
        writeData = new DataCompress(writeData);
        writeData = new DataEncryption(writeData);
        writeData.Write(writeBuffer);

        /* Read the data from database with decorator functionalities */
        BufferData readBuffer = new BufferData("");
        DatabaseManager readData = new FileManager();
        readData = new DataCompress(readData);
        readData = new DataEncryption(readData);
        readData.Read(readBuffer);
    }
}