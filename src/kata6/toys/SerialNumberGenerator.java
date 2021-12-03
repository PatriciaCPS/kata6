
package kata6.toys;

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
