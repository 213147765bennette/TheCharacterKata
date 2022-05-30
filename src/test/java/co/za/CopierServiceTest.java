package co.za;

import co.za.Destination.IDestination;
import co.za.Destination.IDestinationImpl;
import co.za.Source.ISource;
import co.za.Source.ISourceImpl;
import co.za.model.Copier;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@MicronautTest
@ExtendWith(MockitoExtension.class)
public class CopierServiceTest {

    @Mock
    private Copier copier;
    @Mock
    private ISource src;
    @Mock
    private IDestination dest;

    private ISourceImpl iSource;
    private IDestinationImpl iDestination;

    @BeforeAll
    void init() {

        copier = new Copier(src,dest);
        iSource = new ISourceImpl();
        iDestination = new IDestinationImpl();
    }

    @Order(1)
    @Test
    void testCopy() {

        copier = new Copier(iSource, iDestination);
        copier.copy();

        //Did this so that I can assert the results
        var charToRead = iSource.readChar();
        assertEquals('B', charToRead);

        //check write process
        iDestination.writeChar(charToRead);

    }

}
