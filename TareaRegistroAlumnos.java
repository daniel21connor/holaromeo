
package tarearegistroalumnos;
import java.util.Scanner;
public class TareaRegistroAlumnos {
    


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
  
        
        RgistroAlumno a= new RgistroAlumno ();
        
       
        
      
        
           System.out.println("Ingresa tu codigo");
          String codigo = leer.nextLine();
            System.out.println("Ingresa tu numero");
          int numero = leer.nextInt();
           System.out.println("Ingresa tu nombre");
         String  nombre = leer.next();
         
         
         
          System.out.println("Ingresa tu correo");
         String  correo = leer.next();
            String alias = leer.nextLine();
           System.out.println("Ingresa tu alias");
       String alia = leer.nextLine();
          
          a.hola(codigo, nombre, alia, correo,numero );
        a.mostrarTransacciones();
        
        
        }
         
    
    }

    
           

