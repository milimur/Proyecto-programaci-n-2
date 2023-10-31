
package proyecto;

public class Hidrogel{
    private int cubrePantalla;

    public Hidrogel(int cubrePantalla) {
        this.cubrePantalla = cubrePantalla;
    }

    public int getCubrePantalla() {
        return cubrePantalla;
    }

    public void setCubrePantalla(int cubrePantalla) {
        this.cubrePantalla = cubrePantalla;
    }

    @Override
    public String toString() {
        return "Hidrogel{"+super.toString() + "cubrePantalla=" + cubrePantalla + '}';
    }
    
}
