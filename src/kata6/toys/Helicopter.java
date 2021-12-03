
package kata6.toys;

/**
 *
 * @author Patricia
 */
public class Helicopter {
   private final Integer serialNumber; 
   private final String type = "Helicopter";

    public Helicopter(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }
   
   
    
    
    public void pack(){
    
        System.out.println("El" + type + " con el número de serie" 
                +serialNumber.toString() +"está empaquetado \n");
    }
    
    public void label(){
    
        System.out.println("El" + type  +" con el número de serie" 
                +serialNumber.toString() +"está empaquetado \n");
    
    }
    
}
