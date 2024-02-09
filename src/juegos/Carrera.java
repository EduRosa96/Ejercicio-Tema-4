package juegos;

public class Carrera {
    private Coche coche1;
    private Coche coche2;
    private Coche coche3;
    private Coche coche4;
    private Reloj tiempoInicio;
    private boolean corriendo;

    //constructor
    public Carrera(Coche coche1, Coche coche2, Coche coche3,
                   Coche coche4, Reloj tiempoInicio, boolean corriendo) {
        this.coche1 = coche1;
        this.coche2 = coche2;
        this.coche3 = coche3;
        this.coche4 = coche4;
        this.tiempoInicio = tiempoInicio;
        this.corriendo = corriendo;
    }

    //setters y getters
    public Coche getCoche1() {
        return coche1;
    }

    public void setCoche1(Coche coche1) {
        this.coche1 = coche1;
    }

    public Coche getCoche2() {
        return coche2;
    }

    public void setCoche2(Coche coche2) {
        this.coche2 = coche2;
    }

    public Coche getCoche3() {
        return coche3;
    }

    public void setCoche3(Coche coche3) {
        this.coche3 = coche3;
    }

    public Coche getCoche4() {
        return coche4;
    }

    public void setCoche4(Coche coche4) {
        this.coche4 = coche4;
    }

    public boolean isCorriendo() {
        return corriendo;
    }

    public void setCorriendo(boolean corriendo) {
        this.corriendo = corriendo;
    }

    //métodos
    public void iniciarCarrera(int horas, int minutos, int segundos) {
        tiempoInicio = new Reloj(0, 0, 0);
    }

    public void carreraEnCurso(int horas, int minutos, int segundos) {
        if (horas >= 0 && minutos >= 0 && segundos >= 0) {
            setCorriendo(true);
        } else {
            setCorriendo(false);
        }
    }


    public void tiempoVuelta(Coche coche, int horas, int minutos, int segundos) {
        if (corriendo = true) {
            coche.getTiempoDeVuelta().setHoras(horas);
            coche.getTiempoDeVuelta().setMinutos(minutos);
            coche.getTiempoDeVuelta().setSegundos(segundos);
            System.out.println(coche.getNombreCoche() + " ha registrado su tiempo de vuelta");
        } else {
            System.out.println("Aún no ha empezado la carrera.");
        }
    }

    private void generarClasificacion() {
        System.out.println("Clasificación de la carrera:");
        System.out.println("1. " + coche1.getNombreCoche() + " - Tiempo: " + coche1.getTiempoDeVuelta());
        System.out.println("2. " + coche2.getNombreCoche() + " - Tiempo: " + coche2.getTiempoDeVuelta());
        System.out.println("3. " + coche3.getNombreCoche() + " - Tiempo: " + coche1.getTiempoDeVuelta());
        System.out.println("4. " + coche4.getNombreCoche() + " - Tiempo: " + coche2.getTiempoDeVuelta());
    }

    public void empezarCarrera() {
        setCorriendo(true);
    }


    public void finalizarCarrera() {
        setCorriendo(false);
        System.out.println("Carrera finalizada");
        generarClasificacion();
    }
}





