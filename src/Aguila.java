// Clase que extiende Animal e implementa la interfaz Volador
class Aguila extends Animal implements Volador {

    public Aguila(String nombre) {
        super(nombre);
    }

    // Implementación del metodo abstracto moverse
    @Override
    public void moverse() {
        System.out.println("El águila se mueve volando.");
    }

    // Implementación del metodo de la interfaz Volador
    @Override
    public void volar() {
        System.out.println("El águila está volando a grandes alturas.");
    }
}
