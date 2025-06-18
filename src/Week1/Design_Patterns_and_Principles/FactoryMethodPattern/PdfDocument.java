package Week1.Design_Patterns_and_Principles.FactoryMethodPattern;

public class PdfDocument implements Document
{
    public void open()
    {
        System.out.println("Opening a PDF Document");
    }
}
