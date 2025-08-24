package FactoryDesignPattern.DocumentConversion;

import FactoryDesignPattern.DocumentConversion.Factory.DOCXFactory;
import FactoryDesignPattern.DocumentConversion.Factory.DocumentFactory;
import FactoryDesignPattern.DocumentConversion.Factory.PDFFactory;

public class Main {
    public static void main(String[] args) {
        DocumentFactory docxDoc = new DOCXFactory();
        docxDoc.convertDocument("test.ini");
        System.out.println();

        DocumentFactory pdfDoc = new PDFFactory();
        pdfDoc.convertDocument("test.txt");
        System.out.println();
    }
}
