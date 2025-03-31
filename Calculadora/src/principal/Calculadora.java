package principal;
import menu.Menu;
import operaciones.Operaciones;

import java.util.Properties;
import java.util.logging.*;

import Logs.FormatoHTML;


/**El main del programa
 * 
 * 
 * @author Jon Ortuzar
 * 
 * @version 1
 **/
public class Calculadora{
	
	private static final Logger logger = Logger.getLogger(Calculadora.class.getName());
	
	static {
		Properties properties=new Properties();
		try {
			
			
			//Configurar logger
			LogManager.getLogManager().reset();
			FileHandler fileHandler = new FileHandler("resultadosCalculadora.html"); //Con el true sobreescribira el documento, con false o vacio añadira los pasos nuevos
			fileHandler.setFormatter(new FormatoHTML());
			logger.addHandler(fileHandler);
			logger.setLevel(Level.ALL);
			
		}catch(Exception e) {
			System.out.println("No se puede configurar el logger: "+e.getMessage());
		}
	}
	
	
	/**
	 * 
	 * La clase principal, donde se llevara a cabo todo
	 * 
	 * @param args: */
	
	//
    public static void main(String[] args) {   
        int resultado = 0;
        String operacion = "";
        int[] operandos = new int [2];
        
        Menu menu = new Menu();
        Operaciones operaciones = new Operaciones();
        
        do{
            operandos = menu.pedirNumeros();
            operacion = menu.menuOpciones();
            
            try {
            	if (operacion.equalsIgnoreCase("+")){
                    resultado = operaciones.sumar(operandos[0], operandos[1]);
                    System.out.println ("Resultado: " + resultado);
                    
                    logger.log(Level.FINE,"Operacion suma:");
                    
                } else if (operacion.equalsIgnoreCase("-")){
                    resultado = operaciones.restar(operandos[0], operandos[1]);
                    System.out.println ("Resultado: " + resultado);
                    
                    logger.log(Level.FINE,"Operacion resta");
                    
                } else if (operacion.equalsIgnoreCase("*")){
                    resultado = operaciones.multiplicar(operandos[0], operandos[1]);
                    System.out.println ("Resultado: " + resultado);
                    
                    logger.log(Level.FINE,"Operacion multiplicacion");
                    
                } else if (operacion.equalsIgnoreCase("/")){
                    resultado = operaciones.dividir(operandos[0], operandos[1]);
                    System.out.println ("Resultado: " + resultado);
                    
                    logger.log(Level.FINE,"Operacion division");
                    
                } else if (operacion.equalsIgnoreCase("%")){
                    resultado = operaciones.resto(operandos[0], operandos[1]);
                    System.out.println ("Resultado: " + resultado);
                    
                    logger.log(Level.FINE,"Operaciones diviosion manual");
                    
                } else {
                    System.out.println ("Operaci�n no v�lida");
                }
            }catch(ArithmeticException e) {
            	System.err.println("Error: "+e.getMessage());
            	logger.log(Level.WARNING,"Error al realizar operacion: "+e.getMessage());
            }
            
        }   while (menu.repetir());
    }
}