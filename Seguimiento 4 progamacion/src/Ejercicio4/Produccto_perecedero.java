
package Ejercicio4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ThreadLocalRandom;

public class Produccto_perecedero extends Produccto {

    public Produccto_perecedero(String nombre, String descripcion, double precio, int stock){
        super(nombre, descripcion, precio, stock);
    }

    public String mostrarFecha() {
        LocalDateTime now = LocalDateTime.now();
        int randomDays = ThreadLocalRandom.current().nextInt(1, 31);
        LocalDateTime randomFutureDate = now.plusDays(randomDays);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return randomFutureDate.format(formatter);
    }
}