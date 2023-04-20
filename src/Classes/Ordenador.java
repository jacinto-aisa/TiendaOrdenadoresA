package Classes;

import Interfaces.IGuardable;
import Interfaces.IMenorizable;
import Interfaces.IProcesable;
import Interfaces.IVendible;

public class Ordenador  implements IVendible {
    IGuardable disco;
    IMenorizable memoria;
    IProcesable procesador;

    private Integer totalCalor = 0;
    private Integer totalPrecio = 0;

    public Ordenador(Disco disco, Memoria memoria, Procesador procesador) {
        this.disco = disco;
        this.memoria = memoria;
        this.procesador = procesador;
        totalCalor += disco.getCalor() + memoria.getCalor() + procesador.getCalor();
        totalPrecio += disco.getPrecio() + memoria.getPrecio() + procesador.getPrecio();
    }

    @Override
    public int dameCalor() {
        return totalCalor;
    }

    @Override
    public int damePrecio() {
        return totalPrecio;
    }
}
