package SingletonDesignPattern.Logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LogWriter {
    private PrintWriter writer;
    public LogWriter(String fileName, boolean appendLines) {
        try {
            FileWriter fileWriter = new FileWriter(fileName, appendLines);
            writer = new PrintWriter(fileWriter, true);
        } catch (IOException e) {
            System.out.println("IOEXCEPTION: " + e.getMessage());
        }
    }
    public void write(String message) {
        writer.println(message);
    }
    public void close() {
        if(writer != null)
            writer.close();
    }
}
