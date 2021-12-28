
package kata6.Factories;

import kata6.toyproducts.Toy;

public abstract class ToyFactory {
    private Toy toy;
   
   
    public Toy produceToy(Integer serialNumber ){
        toy = this.createToy(serialNumber);
        toy.pack();
        toy.label();
        return toy;
    }
    
    protected abstract Toy createToy (Integer serialNumber);
}
