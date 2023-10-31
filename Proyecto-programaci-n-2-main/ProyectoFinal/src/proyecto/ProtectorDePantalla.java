
package proyecto;

public class ProtectorDePantalla extends Producto {
    private VidrioTemplado vidrio;
    private Hidrogel hidrogeles;

    public ProtectorDePantalla() {
        super();
    }

    public ProtectorDePantalla(VidrioTemplado vidrio) {
        this.vidrio = vidrio;
    }

    public ProtectorDePantalla(Hidrogel hidrogel) {
        this.hidrogeles = hidrogel;
    }

    public VidrioTemplado getVidrio() {
        return vidrio;
    }

    public void setVidrio(VidrioTemplado vidrio) {
        this.vidrio = vidrio;
    }

    public Hidrogel getHidrogeles() {
        return hidrogeles;
    }

    public void setHidrogeles(Hidrogel hidrogel) {
        this.hidrogeles = hidrogel;
    }
    
}
