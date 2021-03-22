package uk.co.bernardmcgeever.spring5.chapter2.HelloWorldAnnotations;

public interface MessageRenderer
{
    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
