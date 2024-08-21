package Creditos;

public class mainCredito {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Jeon", 1091997, "Selt cra. 14-35", "Excelente", 5000.00);

        Propiedad propiedad1 = new Propiedad("idk 19-97", 1500000.0);

        solicitudCredito solicitudPersonal = new solicitudCredito(cliente1, "personal", 100000.00, 36, 5.5);

        solicitudCredito solicitudHipotecario = new solicitudCredito(cliente1, "hipotecario", 140000.00, 20, 2.5);

        Credito creditoPersonal = new Credito(solicitudPersonal);
        creditoPersonal.aprobar();
        System.out.println("Credito Personal: " + creditoPersonal.getEstado());

        creditoHipotecario creditoHipotecario = new creditoHipotecario(solicitudHipotecario, propiedad1);
        creditoHipotecario.aprobar();
        System.out.println("Credito Hipotecario: " + creditoHipotecario.getEstado());
        System.out.println("Propiedad: " + creditoHipotecario.getPropiedad());

    }
}
