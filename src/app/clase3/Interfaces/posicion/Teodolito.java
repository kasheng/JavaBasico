package app.clase3.Interfaces.posicion;

public class Teodolito {

    public static void main(String[] args) {

        Position auto = new Auto(20, 30);
        Position persona = new Persona(50, 20);
                   
        Teodolito.getDistancia(auto, persona);
    }

    public static void getDistancia(Position p1, Position p2) {

        double dist1 = p1.getLatitud() - p2.getLatitud();
        double dist2 = p1.getLongitud() - p2.getLongitud();

        System.out.println(Math.sqrt(dist1 * dist1 + dist2 * dist2));

    }
}
