package FactoryDesignPattern.DocumentConversion.Factory;

import FactoryDesignPattern.DocumentConversion.Document;
import FactoryDesignPattern.DocumentConversion.TXTConverter;

public class TXTFactory extends DocumentFactory{
    @Override
    protected Document createDocument() {
        return new TXTConverter();
    }
}
