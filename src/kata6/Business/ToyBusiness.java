
package kata6.Business;

import java.util.HashMap;
import java.util.Map;
import kata6.Factories.SerialNumberGenerator;
import kata6.Factories.ToyFactory;
import kata6.toyproducts.Toy;



public class ToyBusiness {
    
    final private Map<String, ToyFactory> toyFactories = new HashMap<>();
    protected final SerialNumberGenerator serialNumberGenerator  = new SerialNumberGenerator();


    public void add(String type, ToyFactory toyFactory){
        this.toyFactories.put(type, toyFactory);
    }

   
   
   public Toy produceToy(String type){
       return toyFactories.get(type).produceToy(serialNumberGenerator.next());
       
   }
   

}
