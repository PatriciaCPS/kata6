
package kata6.toyproducts.models;

import kata6.toyproducts.Toy;

/**
 *
 * @author Patricia
 */
public class CarToy implements Toy {
   
   private final Integer serialNumber; 
   private final String type = "Car";
   
    public CarToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    
    public void pack(){
    
        System.out.println("El " + type + " con el número de serie " 
                +serialNumber.toString() +"está empaquetado \n");
    }
    
    public void label(){
    
        System.out.println("El " + type  +" con el número de serie " 
                +serialNumber.toString() +"está empaquetado \n");
    
    }
    
}