package operaciones;
/**Donde se llevan a cabo los calculos**/
public class Operaciones{

	/**Suma el valor de dos numeros introducidos
	 * 
     * @param valor1: valor del primer numero
     * @param valor2: valor del segundo numero
	 * @return numero: es la suma de los dos anteriores
	 **/
    public int sumar (int valor1, int valor2){
        int numero;
        numero = valor1 + valor2;
        return numero;
    }
    
    /**Resta el valor de dos numeros introducidos
     * 
     * @param valor1: valor del primer numero
     * @param valor2: valor del segundo numero
     * @return numero: es la resta de los dos anteriores
     **/
    public int restar (int valor1, int valor2){
        int numero;
        numero = valor1 - valor2;
        return numero;
    }
    
    /**Multiplica los dos numeros introducidos
     * 
     * @param valor1: valor del primer numero
     * @param valor2: valor del segundo numero
     * @return numero: es la multiplicacion de los numeros anteriores
     **/
    public int multiplicar (int valor1, int valor2){
        int numero;
        numero = valor1 * valor2;
        return numero;
    }
    
    /**Hace una division entre dos numeros
     * 
     * @param valor1: valor del primer numero
     * @param valor2: valor del segundo numero
     * @return numero: es la division de los dos numeros anteriores
     **/
    public int dividir (int valor1, int valor2){
        int numero;
        numero = valor1 / valor2;
        return numero;
    }
    
    /**Hace el resto de los numeros
     * 
     * @param valor1: valor del primer numero
     * @param valor2: valor del segundo numero
     * @return numero: es la resta de los numeros anteriores
     **/
    public int resto (int valor1, int valor2){
        int numero;
        numero = valor1 % valor2;
        return numero;
    }
}