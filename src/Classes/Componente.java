package Classes;

import Interfaces.IComponable;

public class Componente implements IComponable {
    String númeroDeSerie;
    Integer precio = 0;

    String descripcion;

    public Componente(String númeroDeSerie, Integer precio, String descripcion) {
        this.númeroDeSerie = númeroDeSerie;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public Integer getPrecio(){
        return precio;
    }
}
