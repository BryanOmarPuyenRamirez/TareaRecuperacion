package com.mycompany.sistemaregistro;

public class LenguajeProgramacion {
    private int AnioCreacion;
    private String CaracteristicaPrincipal;
    private String Nombre;
    private String Utilizacion;

    public int getAnioCreacion() {
        return AnioCreacion;
    }

    public String getCaracteristicaPrincipal() {
        return CaracteristicaPrincipal;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getUtilizacion() {
        return Utilizacion;
    }

    public LenguajeProgramacion(int AnioCreacion, String CaracteristicaPrincipal, String Nombre, String Utilizacion) {
        this.AnioCreacion = AnioCreacion;
        this.CaracteristicaPrincipal = CaracteristicaPrincipal;
        this.Nombre = Nombre;
        this.Utilizacion = Utilizacion;
    }

    public void setAnioCreacion(int AnioCreacion) {
        this.AnioCreacion = AnioCreacion;
    }

    public void setCaracteristicaPrincipal(String CaracteristicaPrincipal) {
        this.CaracteristicaPrincipal = CaracteristicaPrincipal;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setUtilizacion(String Utilizacion) {
        this.Utilizacion = Utilizacion;
    }

    @Override
    public String toString() {
        return "LenguajeProgramacion{" + "AnioCreacion=" + AnioCreacion + ", CaracteristicaPrincipal=" + CaracteristicaPrincipal + ", Nombre=" + Nombre + ", Utilizacion=" + Utilizacion + '}';
    }
   
}