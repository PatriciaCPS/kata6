
package kata6.Business;

import kata6.toyproducts.Toy;


/**
 *
 * @author Patricia
 */
public abstract class ToyBusiness {
    
    private Toy toy;

    protected SerialNumberGenerator serialNumberGenerator = new SerialNumberGenerator();

   
    
    
    /*
    public CarToy createCar(){
       CarToy car = new CarToy( serialNumberGenerator.next());
            car.pack();
            car.label();
        return car;
            
    }
    
    public HelicopterToy createHelicopter(){
       HelicopterToy helicopter = new HelicopterToy( serialNumberGenerator.next());
            helicopter.pack();
            helicopter.label();
        return helicopter;              
    }
    */
    
     public  Toy createToy(String juguete){
        
       /*
         if ("helicoptero".equals(juguete)){
         HelicopterToy helicopter = new HelicopterToy( serialNumberGenerator.next());
            helicopter.pack();
            helicopter.label();
            return (Toy) helicopter; 
         } else {
            CarToy car = new CarToy( serialNumberGenerator.next());
            car.pack();
            car.label();
            return (Toy) car;
         }     
*/
       /*
       Toy toy = null;
       switch(juguete){
           case "car":
            toy = new CarToy( serialNumberGenerator.next());
            toy.pack();
            toy.label(); 
            break;
           case "helicopter":
            toy = new HelicopterToy( serialNumberGenerator.next());
            toy.pack();
            toy.label(); 
            break;

       }
*/
       return toy;

    }
}