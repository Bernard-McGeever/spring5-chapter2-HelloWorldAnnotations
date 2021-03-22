package uk.co.bernardmcgeever.spring5.chapter2.HelloWorldAnnotations;

public class HelloWorldMessageProvider implements MessageProvider
{

    @Override
    public String getMessage()
    {
        return "Hello, World!";
    }
}
