package Classes;
import Interfaces.IComponable;
import Interfaces.IGuardable;
public class Disco implements IGuardable {
    IComponable propiedades;
    public Integer calor;
    public String almacenamiento;

    public Disco(IComponable propiedades, Integer calor, String almacenamiento) {
        this.propiedades = propiedades;
        this.calor = calor;
        this.almacenamiento = almacenamiento;
    }

    @Override
    public Integer getCalor() {
        return calor;
    }

    @Override
    public String getAlmacenamiento() {
        return almacenamiento;
    }


    public Integer getPrecio() {
        return propiedades.getPrecio();
    }
}
