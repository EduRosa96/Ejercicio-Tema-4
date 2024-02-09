package juegos;

class Coche extends Reloj {
    //propiedades
    private String nombreCoche;
    private Reloj tiempoDeVuelta;

    //constructor
    public Coche(String nombreCoche, int horas, int minutos, int segundos) {
        super(horas, minutos, segundos);
        this.nombreCoche = nombreCoche;
        this.tiempoDeVuelta = new Reloj(horas, minutos, segundos);
    }
    //getters y setters

    public String getNombreCoche() {
        return nombreCoche;
    }

    public void setNombreCoche(String nombreCoche) {
        this.nombreCoche = nombreCoche;
    }

    public Reloj getTiempoDeVuelta() {
        return tiempoDeVuelta;
    }

    public void setTiempoDeVuelta(Reloj tiempoDeVuelta) {
        this.tiempoDeVuelta = tiempoDeVuelta;
    }

    //método toString

    @Override
    public String toString() {
        return "Nombre del coche: " +
                nombreCoche + "Tiempo de Vuelta: " + tiempoDeVuelta;
    }
}
