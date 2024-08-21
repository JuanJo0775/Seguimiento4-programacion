package Creditos;

public class Cliente extends Persona {
    private String historialCrediticio;
    private double ingresos;

    public Cliente(String nombre, int identificacion, String direccion, String historialCrediticio, double ingresos) {
        super(nombre, identificacion, direccion);
        this.historialCrediticio = historialCrediticio;
        this.ingresos = ingresos;
    }

    public String getHistorialCrediticio() {
        return historialCrediticio;
    }

    public void setHistorialCrediticio(String historialCrediticio) {
        this.historialCrediticio = historialCrediticio;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }
}
