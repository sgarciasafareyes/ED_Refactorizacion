package Ejercicio5;

public class Ejercicio5 {
    private double cantidad;

    // antes:
    void imprimeFactura() {
        imprimeEncabezado();
        //imprime los detalles
        String nombre = null;
        System.out.println ("Nombre:        " +  nombre );
        System.out.println ("Cantidad       " + getCantidad());
    }

    private void imprimeEncabezado() {
    }

    // después: El código es más legible y más fácil de mantener.
    void imprimeFactura() {
        imprimeEncabezado();
        imprimeDetalles(getCantidad());
    }

    private double getCantidad() {
        return 0;
    }

    void imprimeDetalles (double cantidad) {
        this.cantidad = cantidad;
        String nombre = null;
        System.out.println ("Nombre:        " +  nombre );
        System.out.println ("Cantidad       " + cantidad );  // corregido
    }
}


