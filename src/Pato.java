// Clase que extiende Animal e implementa tanto Volador como Nadador
class Pato extends Animal implements Volador, Nadador {

    public Pato(String nombre) {
        super(nombre);
    }

    // Implementación del metodo abstracto moverse
    @Override
    public void moverse() {
        System.out.println("El pato se mueve caminando, nadando o volando.");
    }

    // Implementación del metodo de la interfaz Volador
    @Override
    public void volar() {
        System.out.println("El pato está volando a baja altura.");
    }

    // Implementación del metodo de la interfaz Nadador
    @Override
    public void nadar() {
        System.out.println("El pato está nadando en el lago.");
    }
}
