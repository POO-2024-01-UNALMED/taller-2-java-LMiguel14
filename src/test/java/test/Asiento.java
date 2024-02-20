package test;

public class Asiento {
    String color;
    int precio;
    int registro;

    public void cambiarColor(String nuevoColor) {
        String[] colores = {"verde", "amarillo", "blanco", "negro", "rojo"};
        for (String color : colores) {
            if (nuevoColor.equals(color)) {
                this.color = nuevoColor;
                break;
            }
        }   
    }
        
}
