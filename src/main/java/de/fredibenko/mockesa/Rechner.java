package de.fredibenko.mockesa;

public class Rechner {

    RemoteRechner remote;

    public Rechner(RemoteRechner remote){
        this.remote = remote;
    }
    
    public int berechne(int i, int j) {
        int zwischenergebnis = remote.summiere(i, j);
        return zwischenergebnis * 10;
        // return (i+j)*10;  // test Mockito.verify
    }
}