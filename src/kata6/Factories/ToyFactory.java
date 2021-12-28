
package kata6.Factories;

import kata6.toyproducts.Toy;

public abstract class ToyFactory {
    private Toy toy;
    protected final SerialNumberGenerator serialNumberGenerator  = new SerialNumberGenerator();

   
    public Toy produceToy(String type){
        toy = this.createToy(type);
        toy.pack();
        toy.label();
        return toy;
    }
    
    protected abstract Toy createToy (String type);
}
