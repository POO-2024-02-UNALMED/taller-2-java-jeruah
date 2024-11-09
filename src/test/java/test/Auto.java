package test;

import java.util.ArrayList;

public class Auto {
    String modelo;
    int precio;
    public test.Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados; // Debe ser int

    public int cantidadAsientos() {
        int l = this.asientos.length;
        for (Asiento asiento : this.asientos) {
            if (asiento == null) {
                l -= 1;
            }
        }
        return l;
    }


    public String verificarIntegridad () {
        if (this.registro != this.motor.registro){
            return "Las piezas no son originales";
        }else {
            for (Asiento asiento : this.asientos) {
                if (asiento != null &&asiento.registro != this.registro) {
                    return "Las piezas no son originales";
                }
            }
            return "Auto original";
        }
    }
}

