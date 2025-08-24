package FactoryDesignPattern.DocumentConversion;

public class TXTConverter implements Document{
    private static void initialize() {
        System.out.println("TXTConverter initialized");
    }

    @Override
    public void convert(String inputFile) {
        initialize();
        System.out.println("Converting " + inputFile + " to TXT");
        System.out.println("OUTPUT ==>> " + inputFile.split("\\.")[0] + ".txt");
    }
}
