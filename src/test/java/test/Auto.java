package test;

public class Auto {
    static int cantidadCreados = 0;
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;

    public Auto(String modelo, int precio, Asiento[] asientos, String marca, Motor motor, int registro) {
        this.modelo = modelo;
        this.precio = precio;
        this.asientos = asientos;
        this.marca = marca;
        this.motor = motor;
        this.registro = registro;
    }

    public int cantidadAsientos() {
        int asientosContados = 0;
        for (Asiento asiento : this.asientos) {
            if (asiento != null) {
                asientosContados++;
            }
        }
        return asientosContados;
    }

    public String verificarIntegridad() {
        boolean registrosCoinciden = true;
        int registroMotor = this.motor.getRegistro();
        if (this.registro != registroMotor) {
            registrosCoinciden = false;
        }
        for (Asiento asiento : this.asientos) {
            if (asiento != null && asiento.getRegistro() != this.registro) {
                registrosCoinciden = false;
                break;
            }
        }
        if (registrosCoinciden) {
            return "Auto original";
        } else {
            return "Las piezas no son originales";
        }
    }
}



