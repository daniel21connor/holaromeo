
package tarearegistroalumnos;


public class RgistroAlumno {
   private int codigo;
      private int numero;
    private String nombre;
    private String alias;
    private String correo;
  private String[] vectorTransacciones;  //declaracion de un vector.
    private int indiceVector;
 public RgistroAlumno()
 {
     codigo = 0;
     nombre = " ";
     alias = " ";
     correo ="";
     numero =0;
     vectorTransacciones= new String[10000000];//inicializo el vector
        this.indiceVector=0;
 }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
 
 public void hola(String n, String m, String g, String gg, int ggg){
     this.registrarTransaccion(n, m, g, gg, ggg);
     
     }
     
   
     public void registrarTransaccion(String n, String m, String g, String gg, int ggg){
        indiceVector= indiceVector+1;
   vectorTransacciones[indiceVector]= " El codigo es "+ n +" El nombre es "+ m+ "El alias es "+ g +" El correo es "+ gg+" El numero es "+ ggg ;
     }
     
     public void mostrarTransacciones(){
        try{       
            for (int i=1; i<vectorTransacciones.length;i++){
                if(vectorTransacciones[i] != null){
                    System.out.println(vectorTransacciones[i]);
                }
            }
            System.out.println("\n // otra forma de recorre el vector // \n");
            for(String transaccion : vectorTransacciones){
                if(transaccion != null){
                    System.out.println(transaccion);
                }   
            } 
        }catch(Exception e){
            System.out.println(e.getMessage());       
        }
     
     
     }
}
     
     
