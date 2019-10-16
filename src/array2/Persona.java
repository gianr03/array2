package array2;

import java.util.Scanner;


public class Persona  {
    
    

     Persona datos[] = new Persona [5];
     Scanner lectura = new Scanner (System.in);
     public String nombre;
     public String apellido;
     
    public Persona (){
    
     this.mostrarMenu();
    
    }
    public void mostrarMenu (){
        
        
        System.out.println("Personas\n"
                + "1-Ingresar datos de persona\n"
                + "2-Mostrar datos personas\n"
                + "3-Cerrar\n"
                + "Escoja opcion");
        
        int opcion=lectura.nextInt();
        this.cargarOpcion(opcion);
    }
    public void leerPersona (){
    
        System.out.println("usted ha escogido ingresar dato de persona");
        
        for(int i=0; i<5;i++){
            System.out.println("digite datos de persona "+i+"\n"
                    + "Nombre"); 
            datos[i].nombre = lectura.next();
       
        
        
        
        }
   this.mostrarMenu();
    
    }
    public void escribirPersona(){
    
     for(int i=0; i<5;i++){
        
     }
    }
    public void cargarOpcion(int op){
    
    switch(op) {
    
        case 1: this.leerPersona();
        break;
        
        case 2: this.escribirPersona();
        break;
        
        case 3: System.out.println("Usted ha finalizado el programa");
        break;
        
        default: System.out.println("Opcion invalida");
    
    
    }
        
    }
    
    
    
    
    
    
}
