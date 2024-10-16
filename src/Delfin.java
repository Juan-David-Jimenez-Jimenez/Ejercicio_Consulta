// Clase que extiende Animal e implementa la interfaz Nadador
class Delfin extends Animal implements Nadador {

    public Delfin(String nombre) {
        super(nombre);
    }

    // Implementación del metodo abstracto moverse
    @Override
    public void moverse() {
        System.out.println("El delfín se mueve nadando rápidamente.");
    }

    // Implementación del metodo de la interfaz Nadador
    @Override
    public void nadar() {
        System.out.println("El delfín está nadando en el océano.");
    }
}
