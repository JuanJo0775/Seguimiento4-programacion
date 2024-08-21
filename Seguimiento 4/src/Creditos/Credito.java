package Creditos;

public class Credito {
    private solicitudCredito solicitudCredito;
    private String estado; //

    public Credito(solicitudCredito solicitudCredito) {
        this.solicitudCredito = solicitudCredito;
        this.estado = "pendiente";
    }

    public solicitudCredito getSolicitudCredito() {
        return solicitudCredito;
    }

    public void setSolicitudCredito(solicitudCredito solicitudCredito) {
        this.solicitudCredito = solicitudCredito;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void aprobar(){
        this.estado = "aprobado";
    }

    public void rechazar(){
        this.estado = "rechazado";
    }
}
