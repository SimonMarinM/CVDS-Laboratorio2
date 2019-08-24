package edu.eci.cvds;
import java.util.Arrays;
/**
 * Clase de prueba para impresión
 *
 */
public class App 
{
    /**
     * Método que imprime un saludo al usuario
     * @param args nombre del usuario a saludar (en caso de ser nulo existe un saludo por defecto).     
     */
    public static void main( String[] args )
    {
        System.out.print("Hello ");
        if(args.length>0){
            for (int i=0;i<args.length;i++){
            System.out.print(args[i]+" ");
            }
        }else{
            System.out.print("World");
        }
        System.out.print("!\n");
    }
}
