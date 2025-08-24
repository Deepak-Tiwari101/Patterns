package FactoryDesignPattern.DocumentConversion.Factory;

import FactoryDesignPattern.DocumentConversion.DOCXConverter;
import FactoryDesignPattern.DocumentConversion.Document;

public class DOCXFactory extends DocumentFactory{
    @Override
    protected Document createDocument() {
        return new DOCXConverter();
    }
}
