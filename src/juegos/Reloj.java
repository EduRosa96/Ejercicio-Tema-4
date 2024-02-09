package juegos;

import java.util.Scanner;

public class Reloj {
    //propiedades
    private int horas;
    private int minutos;
    private int segundos;

    //constructores
    public Reloj() {
        inicioReloj();
    }

    public Reloj(int horas, int minutos, int segundos) {
        this.horas = this.horas;
        this.minutos = this.minutos;
        this.segundos = this.segundos;
    }

    public void inicioReloj() {
        horas = 0;
        minutos = 0;
        segundos = 0;
    }

    //getters y setters
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        if (horas >= 0 && horas <= 23)
            this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos <= 59)
            this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if (minutos >= 0 && minutos <= 59)
            this.segundos = segundos;
    }
    //métodos

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d",
                this.horas, this.minutos, this.segundos);

    }

    //funciones
    public boolean modificarHora(int horas, int minutos, int segundos) {
        if (horas >= 0 && horas < 24 && minutos >= 0 && minutos < 60 && segundos >= 0 && segundos < 60) {
            return true;
        } else {
            return false;
        }

    }

    public void sumarSegundo() {
        if (segundos >= 0 && segundos < 60) {
            segundos++;
        }
    }

    public void sumarSegundos(int segundos) {
        if (segundos >= 0 && segundos < 60) {
            Scanner sc = new Scanner(System.in);
            System.out.println("¿Cuántos segundos quieres sumar?");
            int sumaSegundos = sc.nextInt();
            this.segundos = segundos + sumaSegundos;

        }
    }

}
