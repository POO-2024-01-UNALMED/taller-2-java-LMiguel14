package test;
public class Motor {
    int cilindros;
    String tipo;
    int registro;

    public Motor(int cilindros, String tipo, int registro) {
        this.cilindros = cilindros;
        this.tipo = tipo;
        this.registro = registro;
    }

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



