
package proyecto;

public class Funda extends Producto{
    private String color;
    private String material;
    private int reforzada;
    

    public Funda() {
        super();
    }

    @Override
    public String toString() {
        return super.toString()+ "Funda:" + "color=" + color + ", material=" + material + ", reforzada=" + reforzada +'}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int isReforzada() {
        return reforzada;
    }

    public void setReforzada(int reforzada) {
        this.reforzada = reforzada;
    }
    
    
}
