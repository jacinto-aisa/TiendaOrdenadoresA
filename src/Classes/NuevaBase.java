package Classes;

import Interfaces.IComponable;

public class NuevaBase implements IComponable {
    public NuevaBase(String fabricante) {
        Fabricante = fabricante;
    }

    @Override
    public Integer getPrecio() {
        return 78;
    }
    private String Fabricante;

}
