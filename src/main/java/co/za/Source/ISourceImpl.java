package co.za.Source;

import java.io.IOException;
import java.io.StringReader;

public class ISourceImpl implements ISource{
    @Override
    public char readChar(){
        var myText = "Ben";
        var stringReader = new StringReader(myText);

        char character = 'd';

        try {
            for (int i=0; i < myText.length(); i++){
                System.out.println("Char " + i + " is " + myText.charAt(i));
            }

            character = (char) stringReader.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

       return character;
    }
}
