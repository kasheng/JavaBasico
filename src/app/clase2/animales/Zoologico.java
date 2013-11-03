package app.clase2.animales;


public class Zoologico {
    
    public static void main(String[] args) {
        
        Tigre diego = new Tigre("Diego", 20);
        diego.hacerRuido();
        diego.hacerRuido(true);
        diego.comer();
        
        
        Gallina mamba = new Gallina("Mamba", 2);
        mamba.hacerRuido();
        mamba.comer();
        
    }
    
    
}
