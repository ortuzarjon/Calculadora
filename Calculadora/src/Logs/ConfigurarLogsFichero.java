package Logs;
 
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
 
public class ConfigurarLogsFichero {
 
    private static final LogManager logManager = LogManager.getLogManager();
    private static final Logger LOGGER = Logger.getLogger("resultadosCalculadora.html");
    
    static{
        try {
            logManager.readConfiguration(new FileInputStream("./principal/Calculadora.java"));
        } catch (IOException exception) {
            LOGGER.log(Level.SEVERE, "Error al cargar la configuraci�n",exception);
        }
    }
    public static void main(String[] args) {
        LOGGER.fine("Mensaje FINE guardado.");
    }
}
