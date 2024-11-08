package test;
public class Asiento {
    String color;
    int precio;
    int registro;

    public void cambiarColor(String nuevoColor) {
        if (nuevoColor.equalsIgnoreCase("rojo")
                || nuevoColor.equalsIgnoreCase("blanco")
                || nuevoColor.equalsIgnoreCase("verde")
                || nuevoColor.equalsIgnoreCase("amarillo")
                || nuevoColor.equalsIgnoreCase("negro")) {
            this.color = nuevoColor;
        } else {
            System.out.println("No se puede cambiar el color");
        }
    }
}
