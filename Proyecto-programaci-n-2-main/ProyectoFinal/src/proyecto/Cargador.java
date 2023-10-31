
package proyecto;

public class Cargador extends Producto{
    private String tipoEntrada;
    private int inalambrico;

    public Cargador() {
        super();
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoeEntrada) {
        this.tipoEntrada = tipoeEntrada;
    }

    public int isInalambrico() {
        return inalambrico;
    }

    public void setInalambrico(int inalambrico) {
        this.inalambrico = inalambrico;
    }

    @Override
    public String toString() {
        return "Cargador{" + super.toString()+ "tipoEntrada=" + tipoEntrada + ", inalambrico=" + inalambrico + '}';
    }
        
    
}
