package Week1.Design_Patterns_and_Principles.FactoryMethodPattern;

public class ExcelDocument implements Document
{
    public void open()
    {
        System.out.println("Opening an Excel Document");
    }
}
