package co.za.model;

import co.za.Destination.IDestination;
import co.za.Source.ISource;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.IOException;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Copier {
    private ISource src;
    private IDestination dest;

   public void copy()  {

        char myCharacter = 0;
        try {
            //read
            myCharacter = src.readChar();

            //Write
            dest.writeChar(myCharacter);
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
