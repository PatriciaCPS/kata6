
package kata6;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import kata6.Business.ToyBusiness;
import kata6.Factories.Regionalfactories.AmericanCarToyFactory;
import kata6.Factories.Regionalfactories.AmericanSubmarineToyFactory;
import kata6.Factories.Regionalfactories.AsianHelicopterToyFactory;
import kata6.toyproducts.Toy;

/**
 *
 * @author Patricia
 */
public class Main {

    public static void main(String[] args) {
       ArrayList<Toy> toys = new ArrayList<>();
       AmericanCarToyFactory americanCarToyFactory = new AmericanCarToyFactory();
       AsianHelicopterToyFactory asianHelicopterToyFactory = new AsianHelicopterToyFactory();
       AmericanSubmarineToyFactory americanSubmarineToyFactory = new  AmericanSubmarineToyFactory();
       ToyBusiness toyBusiness = new ToyBusiness();
       toyBusiness.add("car",new AmericanCarToyFactory());
       toyBusiness.add("helicopter",new AsianHelicopterToyFactory());
       toyBusiness.add("submarine",new  AmericanSubmarineToyFactory());
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
                
                case "submarine":
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
