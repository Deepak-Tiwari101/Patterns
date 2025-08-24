package FactoryDesignPattern.DocumentConversion.Factory;

import FactoryDesignPattern.DocumentConversion.Document;
import FactoryDesignPattern.DocumentConversion.PDFConverter;

public class PDFFactory extends DocumentFactory{
    @Override
    protected Document createDocument() {
        return new PDFConverter();
    }
}
