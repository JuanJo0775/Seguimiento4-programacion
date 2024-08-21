package Creditos;

public class Propiedad {
    private String direccion;
    private double valor;

    public Propiedad(String direccion, double valor){
        this.direccion = direccion;
        this.valor = valor;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "direccion =" + direccion + '\'' +
                ", valor = " + valor;
    }
}
