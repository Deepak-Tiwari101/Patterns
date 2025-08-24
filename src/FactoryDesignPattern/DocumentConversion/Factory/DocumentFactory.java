package FactoryDesignPattern.DocumentConversion.Factory;

import FactoryDesignPattern.DocumentConversion.Document;

public abstract class DocumentFactory {
    protected abstract Document createDocument();

    public void convertDocument(String inputFile) {
        Document document = createDocument();
        document.convert(inputFile);
    }
}
