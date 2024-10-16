// Estudiante: Juan David Jimenez Jimenez

public class Main {
    public static void main(String[] args) {
        // Crear instancias de los animales
        Aguila aguila = new Aguila("Águila Real");
        Delfin delfin = new Delfin("Delfín ");
        Pato pato = new Pato("Pato ");

        // Mostrar información y comportamiento del águila
        aguila.mostrarInfo();
        aguila.moverse();
        aguila.volar();

        System.out.println();

        // Mostrar información y comportamiento del delfín
        delfin.mostrarInfo();
        delfin.moverse();
        delfin.nadar();

        System.out.println();

        // Mostrar información y comportamiento del pato
        pato.mostrarInfo();
        pato.moverse();
        pato.volar();
        pato.nadar();
    }
}
