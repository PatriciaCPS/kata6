
package kata6.toyproducts.models;

import kata6.toyproducts.Toy;

/**
 *
 * @author Patricia
 */
public class AmericanHelicopterToy implements Toy{

    private final Integer serialNumber; 
    private final String type = "Helicopter";

    public AmericanHelicopterToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    
    
    @Override
    public void pack() {
         System.out.println("El " + type + " con el número de serie " 
                +serialNumber.toString() +" está empaquetado para el"
                        + " sector americano");
    }

    @Override
    public void label() {
        System.out.println("El " + type  +" con el número de serie " 
                +serialNumber.toString() +" está empaquetado para el "
                        + " mercado americano");
    
    }
    
}
