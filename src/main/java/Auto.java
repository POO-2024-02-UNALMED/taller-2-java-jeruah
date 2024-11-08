package test;

import java.util.ArrayList;

public class Auto {
    String modelo;
    int precio;
    test.Asiento[] asientos;
    String marca;
    test.Motor motor;
    int registro;
    static int cantidadCreados; // Debe ser int

    public int cantidadAsientos() {
        return this.asientos.length;
    }


    public String verificarIntegridad (){
        String result = "Auto original";
        if (this.motor != null && this.motor.registro == this.registro) {
            for (test.Asiento asiento : this.asientos) {
                if (asiento.registro != this.registro) {
                    result = "Las piezas no son originales";
                    break;
                }
            }
        } else {
            result = "Las piezas no son originales";
        }
        return result;
    }
}

