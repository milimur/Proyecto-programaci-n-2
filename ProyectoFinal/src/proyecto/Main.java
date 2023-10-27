
package proyecto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    static  Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        ArrayList<Funda> fundas = new ArrayList<>();
        ArrayList<Cargador> cargadores = new ArrayList<>();
        ArrayList<ProtectorDePantalla> protectoresP = new ArrayList<>();
        
        menu(fundas, cargadores, protectoresP);
        
    }
    
    public static void menu(ArrayList<Funda> fundas, ArrayList<Cargador> cargadores, ArrayList<ProtectorDePantalla> protectoresP){
        int opcion, opcionProtector;
        
        do{
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
                    
                    System.out.println("Marca: ");
                    f.setMarca(sc.nextLine());
                    System.out.println("Modelo: ");
                    f.setModelo(sc.nextLine());
                    System.out.println("Precio: ");
                    f.setPrecio(sc.nextDouble());
                    System.out.println("Identificador: ");
                    f.setId(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Color: ");
                    f.setColor(sc.nextLine());
                    System.out.println("Material: ");
                    f.setMaterial(sc.nextLine());       
                    System.out.println("Reforzada (1. si / 2. no ): ");
                    f.setReforzada(sc.nextInt());
                    
                    fundas.add(f);
                    break;
                case 2:
                    System.out.println("CATEGORÍA CARGADORES");
                    Cargador c = new Cargador();
                    
                    System.out.println("Marca: ");
                    c.setMarca(sc.nextLine());
                    System.out.println("Modelo: ");
                    c.setModelo(sc.nextLine());
                    System.out.println("Precio: ");
                    c.setPrecio(sc.nextDouble());
                    System.out.println("Identificador: ");
                    c.setId(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Tipo de entrada: ");
                    c.setTipoEntrada(sc.nextLine());
                    System.out.println("Inalambrico (1. si / 2. no): ");
                    c.setInalambrico(sc.nextInt());  
                    
                    cargadores.add(c);
                    break;
                    
                case 3:
                    System.out.println("CATEGORÍA PROTECTORES DE PANTALLA");
                    System.out.println("1. vidrio templado / 2. hidrogel");
                    opcionProtector = sc.nextInt();
                    ProtectorDePantalla p = new ProtectorDePantalla();
                    
                    if(opcionProtector == 1){
                        
                        System.out.println("Marca: ");
                        p.setMarca(sc.nextLine());
                        System.out.println("Modelo: ");
                        p.setModelo(sc.nextLine());
                        System.out.println("Precio: ");
                        p.setPrecio(sc.nextDouble());
                        System.out.println("Identificador: ");
                        p.setId(sc.nextInt());
                        sc.nextLine();
                        System.out.println(" Templado (1. si / 2. no): ");
                        p.setTemplado(sc.nextInt());
                        System.out.println("Dureza: ");
                        p.setDureza(sc.nextInt());  
                        
                    }else{
                        
                        
                    }
                    
                    break;
                    
                case 4:
                    System.out.println("COMPRA TOTAL");
                    break;
                  
                case 5: break;  
                  
            }
            
        }while(opcion != 5);
        
        
        
    }
    
}
