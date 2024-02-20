package test;

public class Asiento {
    String color;
    int precio;
    int registro;

    public void cambiarColor(String nuevoColor) {
        String[] colores = {"verde", "amarillo", "blanco", "negro", "rojo"};
        for (String color : colores) {
            if (color.equals(nuevoColor)) {
                this.color = nuevoColor;
                break;
            }
        }
    }

    public int getRegistro() {
        return this.registro;
    }
}
