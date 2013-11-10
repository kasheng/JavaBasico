package app.clase3.universo;

import app.clase3.universo.abstractos.Humano;

public class Terricola extends Humano{

    @Override
    public void comer() {
        System.out.println("Comiendo");
    }

    @Override
    public void comunicarse() {
        System.out.println("Comunicando");
    }

    @Override
    public void sentir() {
        System.out.println("Sintiendo");
    }
    
}
