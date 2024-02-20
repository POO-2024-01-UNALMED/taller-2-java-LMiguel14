package test;
public class Motor {
    int numeroCilindros;
    String tipo;
    int registro;

   
    public void cambiarRegistro(int numero) {
        this.registro = numero;
    }

    public void asignarTipo(String nuevoTipo) {
        if ("gasolina".equals(nuevoTipo) || "electrico".equals(nuevoTipo)) {
            this.tipo = nuevoTipo;
        }
    }

    public int getRegistro() {
        return this.registro;
    }
}



