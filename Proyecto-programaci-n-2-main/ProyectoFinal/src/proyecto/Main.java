
package proyecto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    static  Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {

        ArrayList<Producto> fundas = new ArrayList<>();
        ArrayList<Producto> cargadores = new ArrayList<>();
        ArrayList<Producto> protectoresP = new ArrayList<>();
        
        menu(fundas, cargadores, protectoresP);
        
    }
    
    public static void menu(ArrayList<Producto> fundas, ArrayList<Producto> cargadores, ArrayList<Producto> protectoresP){
        int opcion, opcionProtector;
        
        do{
            //try
            System.out.println("Ingrese una opcion: ");
            System.out.println("1. Fundas");
            System.out.println("2. Cargadores");
            System.out.println("3. Protectores de pantalla");
            System.out.println("4. Mostrar compra");
            System.out.println("5. Finalizar compra");
               
            opcion = sc.nextInt();
           
            switch(opcion){
                case 1:
                    System.out.println("CATEGORIA FUNDAS");
                    Funda f = new Funda();
                    
                    sc.nextLine();
                    System.out.println("Marca: ");
                    f.setMarca(sc.nextLine());
                    System.out.println("Modelo: ");
                    f.setModelo(sc.nextLine());
                    //try
                    System.out.println("Precio: ");
                    f.setPrecio(sc.nextDouble());
                    //try
                    System.out.println("Identificador: ");
                    f.setId(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Color: ");
                    f.setColor(sc.nextLine());
                    System.out.println("Material: ");
                    f.setMaterial(sc.nextLine());       
                    //try
                    System.out.println("Reforzada (1. si / 2. no ): ");
                    f.setReforzada(sc.nextInt());
                    
                    fundas.add(f);
                    break;
                case 2:
                    System.out.println("CATEGORÍA CARGADORES");
                    Cargador c = new Cargador();
                    
                    sc.nextLine();
                    System.out.println("Marca: ");
                    c.setMarca(sc.nextLine());
                    System.out.println("Modelo: ");
                    c.setModelo(sc.nextLine());
                    //try
                    System.out.println("Precio: ");
                    c.setPrecio(sc.nextDouble());
                    System.out.println("Identificador: ");
                    c.setId(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Tipo de entrada: ");
                    c.setTipoEntrada(sc.nextLine());
                    //try
                    System.out.println("Inalambrico (1. si / 2. no): ");
                    c.setInalambrico(sc.nextInt());  
                    
                    cargadores.add(c);
                    break;
                    
                case 3:
                    System.out.println("CATEGORÍA PROTECTORES DE PANTALLA");
                    System.out.println("1. vidrio templado / 2. hidrogel");
                    opcionProtector = sc.nextInt();
                    
                    ProtectorDePantalla p = new ProtectorDePantalla();
                    
                    if (opcionProtector == 1) {
                        System.out.println("Dureza del vidrio templado: ");
                        int dureza = sc.nextInt();
                        VidrioTemplado vidrio = new VidrioTemplado(dureza);
                        p.setVidrio(vidrio);
                    } else {
                       System.out.println("Cubre toda la pantalla (1. Si / 2. No): ");
                       int cubrePantalla = sc.nextInt();
                       Hidrogel hidrogel = new Hidrogel(cubrePantalla);
                       p.setHidrogeles(hidrogel); 
                    }
                    
                    sc.nextLine();
                    System.out.println("Marca: ");
                    p.setMarca(sc.nextLine());
                    System.out.println("Modelo: ");
                    p.setModelo(sc.nextLine());
                    System.out.println("Precio: ");
                    p.setPrecio(sc.nextDouble());
                    System.out.println("Identificador: ");
                    p.setId(sc.nextInt());
                    sc.nextLine();
 
                    protectoresP.add(p);
                    break;
                    
                case 4:
                    System.out.println("COMPRA TOTAL"); 
                    mostrarCompra(fundas, fundas.size()-1);
                    mostrarCompra(cargadores, cargadores.size()-1);
                    mostrarCompra(protectoresP, protectoresP.size()-1);
                    break;
                  
                case 5: break;
            }
        }while(opcion != 5);
    }
    
    public static void mostrarCompra(ArrayList<Producto> listaProducto, int indice){
        if(indice < 0){
            return;
        }
        System.out.println(listaProducto.get(indice));
        mostrarCompra(listaProducto, --indice);
    }
}
