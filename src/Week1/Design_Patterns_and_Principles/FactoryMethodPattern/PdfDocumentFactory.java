package Week1.Design_Patterns_and_Principles.FactoryMethodPattern;

public class PdfDocumentFactory extends DocumentFactory
{
    public Document createDocument()
    {
        return new PdfDocument();
    }
}
