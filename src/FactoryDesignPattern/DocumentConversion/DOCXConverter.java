package FactoryDesignPattern.DocumentConversion;

public class DOCXConverter implements Document{
    private static void initialize() {
        System.out.println("DOCXConverter initialized");
    }
    @Override
    public void convert(String inputFile) {
        initialize();
        System.out.println("Converting " + inputFile + " to DOCX");
        System.out.println("OUTPUT ==>> " + inputFile.split("\\.")[0] + ".docx");
    }
}
