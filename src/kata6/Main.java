
package kata6;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import kata6.Business.ToyBusiness;
import kata6.Factories.Regionalfactories.AmericanToyFactory;
import kata6.Factories.Regionalfactories.AsianToyFactory;
import kata6.toyproducts.Toy;

/**
 *
 * @author Patricia
 */
public class Main {

    public static void main(String[] args) {
       ArrayList<Toy> toys = new ArrayList<>();
       AmericanToyFactory americanToyFactory = new AmericanToyFactory();
       AsianToyFactory asianToyFactory = new AsianToyFactory();
       ToyBusiness toyBusiness = new ToyBusiness(americanToyFactory);
    
       Scanner in = new Scanner(System.in);
       String line = "";
       while(!line.equals("exit")){
           line = in.nextLine();
           switch(line){
               case "car":
                   toys.add(toyBusiness.produceToy(line));
                   System.out.println("Toys: " + toys.stream()
                           .map(Object::toString)
                           .collect(Collectors.joining(", ")));
                   break;
                   
               case "helicopter":
                   toys.add(toyBusiness.produceToy(line));
                   System.out.println("Toys: " + toys.stream()
                           .map(Object::toString)
                           .collect(Collectors.joining(", ")));
                   break;
                   
               case "exit":
                   System.out.println("Exiting...");
                   break;
                default:
                    System.out.println("Command unknown");
                    break;

           }
       }
    }
}
