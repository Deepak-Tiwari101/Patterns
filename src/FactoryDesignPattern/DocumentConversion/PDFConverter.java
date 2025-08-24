package FactoryDesignPattern.DocumentConversion;

public class PDFConverter implements Document {
    // initialization logic
    private void initialize() {
        System.out.println("PDFConverter initialized");
    }
    @Override
    public void convert(String inputFile) {
        initialize();
        System.out.println("Converting " + inputFile + " to PDF");
        System.out.println("OUTPUT ==>> " + inputFile.split("\\.")[0] + ".pdf");
    }
}
