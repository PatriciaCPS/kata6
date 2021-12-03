
package kata6.toys;

/**
 *
 * @author Patricia
 */
public class Car {
   
   private final Integer serialNumber; 
   private final String type = "Car";
   
    public Car(Integer serialNumber) {
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
