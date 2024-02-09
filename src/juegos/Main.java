package juegos;

public class Main {
    public static void main(String[] args) {
        // creamos varios coches
        Coche coche1 = new Coche("jawi", 0, 0, 0);
        Coche coche2 = new Coche("Dosci", 0, 0, 0);
        Coche coche3 = new Coche("tresci", 0, 0, 0);
        Coche coche4 = new Coche("vespa", 0, 0, 0);

        Reloj reloj = new Reloj();

        // creamos una carrera nueva y agregamos los coches para comenzarla
        Carrera carrera = new Carrera(coche1, coche2, coche3,coche4, reloj, false );
        // iniciar carrera

        carrera.iniciarCarrera(0,0,0);
        System.out.println("Empieza la carrera");

        //registramos los tiempos de la vuelta de los coches
        carrera.tiempoVuelta(coche1, 0, 2, 15);
        carrera.tiempoVuelta(coche2, 0, 2, 20);
        carrera.tiempoVuelta(coche3, 0, 3, 10);
        carrera.tiempoVuelta(coche4, 0, 3, 15);

        //finalizamos la carrera y mostramos la clasificación final
        carrera.finalizarCarrera();

    }
}