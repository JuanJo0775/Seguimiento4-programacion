package Ejercicio4;

import javax.swing.*;

public class Main_Mercado {

    public static void main(String[] args) {
        Main_Mercado m1 = new Main_Mercado();

        boolean continuar = true;

        JOptionPane.showMessageDialog(null, "Hola, bienvenido al sistema del mercado.");


        while (continuar) {
            String[] opciones = {"Agregar Producto", "Eliminar Producto", "Modificar Stock de Producto", "Mostrar Productos", "Salir"};
            int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Menú Principal",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (seleccion) {
                case 0:
                    Agregar.crearProduccto();
                    break;
                case 1:
                    String nombreEliminar = JOptionPane.showInputDialog("Ingrese el nombre del producto a eliminar:");
                    Agregar.eliminarProduccto(nombreEliminar);
                    break;
                case 2:
                    String nombreModificar = JOptionPane.showInputDialog("Ingrese el nombre del producto para modificar su stock:");
                    int nuevoStock = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo stock:"));
                    Agregar.modificarStock(nombreModificar, nuevoStock);
                    break;
                case 3:
                    Agregar.mostrarProducctos();
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    break;
            }
        }

        JOptionPane.showMessageDialog(null, "Gracias. ¡Hasta luego!");
    }
}