package de.fredibenko.mockesa;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.mockito.Mockito;

public class RechnerTest {
    
    private Rechner rechner;
    private RemoteRechner remote = Mockito.mock(RemoteRechner.class);

    @org.junit.Before
    public void setup() { 
        rechner = new Rechner(remote);
    }

    @org.junit.Test
    public void testBerechne(){
        when(remote.summiere(2, 3)).thenReturn(5);
        assertEquals(50, rechner.berechne(2, 3));
        verify(remote).summiere(2, 3);
    }
}