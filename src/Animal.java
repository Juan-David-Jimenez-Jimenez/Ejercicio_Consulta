// Clase abstracta que define el comportamiento común de todos los animales
abstract class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Metodo abstracto que obliga a las subclases a definir cómo se mueven
    public abstract void moverse();

    // Metodo concreto que pueden usar todas las subclases
    public void mostrarInfo() {
        System.out.println("Soy un animal llamado " + nombre);
    }
}
