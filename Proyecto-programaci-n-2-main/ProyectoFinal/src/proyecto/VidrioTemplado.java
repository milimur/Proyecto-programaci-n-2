
package proyecto;

public class VidrioTemplado{
    private int dureza;

    public VidrioTemplado(int dureza) {
        this.dureza = dureza;
    }

    public int getDureza() {
        return dureza;
    }

    public void setDureza(int dureza) {
        this.dureza = dureza;
    }

    @Override
    public String toString() {
        return "VidrioTemplado{"+super.toString() + "dureza=" + dureza + '}';
    }   
        
}
