package Logs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Properties {
	
	private static final LogManager logManager= LogManager.getLogManager();
	private static final Logger logger=Logger.getLogger("configLoger");
	
	static {
		try {
			logManager.readConfiguration(new FileInputStream(".log/configLog.properties"));
		}catch(IOException exception)
		{
			logger.log(Level.SEVERE,"Error al cargar",exception);
		}
	}
	
	public static void main(String args) {
		logger.fine("Mensaje FINE guardado");
	}
	
}
