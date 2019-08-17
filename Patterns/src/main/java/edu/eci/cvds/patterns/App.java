package edu.eci.cvds;
import java.util.Arrays;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String aux = (args.length>0)?Arrays.toString(args).replace("[","").replace("]","").replace(",",""):"World";
        System.out.println("Hello "+aux);
    }
}
