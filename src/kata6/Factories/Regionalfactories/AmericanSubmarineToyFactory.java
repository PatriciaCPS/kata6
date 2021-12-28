
package kata6.Factories.Regionalfactories;

import kata6.Factories.ToyFactory;
import kata6.toyproducts.Toy;
import kata6.toyproducts.models.AmericanSubmarineToy;


public class AmericanSubmarineToyFactory extends ToyFactory {
    @Override
    public Toy createToy(Integer serialNumber){
        return new AmericanSubmarineToy( serialNumber);
    }
}
