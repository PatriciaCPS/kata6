
package kata6.Factories;

/**
 *
 * @author Patricia
 */
public class SerialNumberGenerator {
    
    private Integer serialNumber = 0;

    public SerialNumberGenerator() {
        
        
    }
    
    public Integer next(){
    
        return serialNumber++;
    }
    
    
    
    
    
    
}
