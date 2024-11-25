package com.mycompany.sistemaregistro;

public class GestionLenguaje {
    private final int FACTOR_CRECIMIENTO = 2;
    private LenguajeProgramacion[] ArregloLenguajes = new LenguajeProgramacion[FACTOR_CRECIMIENTO];
    private int ContadorLenguajes = 0;

    public void AgregarLenguaje(int AnioCreacion, String CaracteristicaPrincipal, String Nombre, String Utilizacion) {
        if (ContadorLenguajes >= ArregloLenguajes.length) {
            LenguajeProgramacion[] Auxiliar = ArregloLenguajes;
            ArregloLenguajes = new LenguajeProgramacion[ContadorLenguajes + FACTOR_CRECIMIENTO];
            System.arraycopy(Auxiliar, 0, ArregloLenguajes, 0, Auxiliar.length);
        }
        ArregloLenguajes[ContadorLenguajes] = new LenguajeProgramacion(AnioCreacion, CaracteristicaPrincipal, Nombre, Utilizacion);
        ContadorLenguajes++;
    }

    public LenguajeProgramacion BuscarLenguaje(String nombre) {
        for (LenguajeProgramacion Lenguaje : ArregloLenguajes) {
            if (Lenguaje == null) {
                continue;
            }
            if (Lenguaje.getNombre().equals(nombre)) {
                return Lenguaje;
            }
        }
        return null;
    }

    public boolean EliminarLenguaje(String nombre) {
        for (int i = 0; i < ArregloLenguajes.length; i++) {
            if (ArregloLenguajes[i] == null) {
                continue;
            }
            if (ArregloLenguajes[i].getNombre().equals(nombre)) {
                ArregloLenguajes[i] = ArregloLenguajes[ContadorLenguajes - 1];
                ArregloLenguajes[ContadorLenguajes - 1] = null;
                ContadorLenguajes--;
                if (ContadorLenguajes > 0) {
                    LenguajeProgramacion[] Auxiliar = ArregloLenguajes;
                    ArregloLenguajes = new LenguajeProgramacion[ContadorLenguajes];
                    System.arraycopy(Auxiliar, 0, ArregloLenguajes, 0, ContadorLenguajes);
                }
                return true;
            }
        }
        return false;
    }

    public LenguajeProgramacion[] getArregloLenguajes() {
        return ArregloLenguajes;
    }

    public void ImprimirLenguajes() {
        for (LenguajeProgramacion lenguaje : ArregloLenguajes) {
            if (lenguaje != null) {
                System.out.println(lenguaje.toString());
            }
        }
    }
}