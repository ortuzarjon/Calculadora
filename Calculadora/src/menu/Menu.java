package menu;
import java.util.Scanner;
/**Donde se elijen las posibles opciones**/
public class Menu {
    private static Scanner teclado = new Scanner(System.in);
   
    /**Para pedir los numeros
     * 
     * @return ret: se devolvera el array ya completo
     **/
    public int[] pedirNumeros(){
        int[] ret = new int[2];
        System.out.print ("Operando 1: ");
        ret [0] = teclado.nextInt();
        System.out.print ("Operando 2: ");
        ret [1] = teclado.nextInt();
        return ret;
    }
    
    /**Donde se mostraran las opciones del menu
     * 
     * @return ret: devolvera el signo que ha sido elegido
     **/
    public String menuOpciones() {
        String ret = "";
        do {
            System.out.print ("Operaciones [+, -, *, /, %]: ");
            ret = teclado.next();
        } while (!((ret.equalsIgnoreCase("+")) || (ret.equalsIgnoreCase("-")) ||
                (ret.equalsIgnoreCase("*")) || (ret.equalsIgnoreCase("/")) ||
                (ret.equalsIgnoreCase("%"))
                ));
                return ret;
    }
    
    
    /**Se preguntara si ahun se desea continuar realizando operaciones
     * 
     * @return ret: devolvera el resultado dependienedo de la opcion que ha escogido le usuario
     **/
    public boolean repetir(){
        boolean ret = false;
        String respuesta;
        do {
            System.out.print ("�Desea continuar trabajando con la calculadora? [s / n]");
            respuesta = teclado.next();
        } while (!((respuesta.equalsIgnoreCase("s")) || (respuesta.equalsIgnoreCase("n"))
                    ));
                    
        if (respuesta.equalsIgnoreCase("s")){
            ret = true;
        }
        return ret;
    }
}