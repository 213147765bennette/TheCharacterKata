package co.za.Destination;

public class IDestinationImpl implements IDestination{
    @Override
    public void writeChar(char character) {
        System.out.println("This Character was called: "+ character);
    }
}
