
package kata6;

import java.util.Scanner;
import kata6.Business.Branches.AmericanToyBusiness;
import kata6.Business.Branches.AsianToyBusiness;
import kata6.Business.SerialNumberGenerator;

/**
 *
 * @author Patricia
 */
public class Main {

    public static void main(String[] args) {
        SerialNumberGenerator serialNumberGenerator = new SerialNumberGenerator() ;
        
        
        OUTER:
        while (true) {
            System.out.println("Introduce command ");
            Scanner keyboard = new Scanner(System.in);
            String command = keyboard.nextLine();
            switch (command) {
                case "exit":
                    break OUTER;
                case "American":
                    AmericanToyBusiness toyBusinessAmerican = new AmericanToyBusiness();
                    
                    
                    
                    OUTER1:
                    while (true) {
                         System.out.println("Introduce command ");
                         Scanner keyboard1 = new Scanner(System.in);
                         String command1 = keyboard.nextLine();
            
                         switch (command1) {
                
                             case "car":
                                toyBusinessAmerican.createToy("car");
                                break;
                            case "helicopter":
                                toyBusinessAmerican.createToy("helicopter");
                                break;
                            default:
                                System.out.println("comando inválido introduce command válido");
                                break;
                        }
                    }
                   
                case "Asian":
                    AsianToyBusiness toyBusinessAsian = new AsianToyBusiness();
                    OUTER2:
                    while (true) {
                        System.out.println("Introduce command ");
                        Scanner keyboard2 = new Scanner(System.in);
                        String command2 = keyboard.nextLine();
                        switch (command) {
                            case "exit":
                                break OUTER2;
                            case "car":

                                toyBusinessAsian.createToy("car");
                                break;
                            case "helicopter":
                                toyBusinessAsian.createToy("helicopter");
                                break;
                            default:
                                System.out.println("comando inválido introduce command válido");
                                break;
                        }
        }
                default:
                    System.out.println("comando inválido introduce command válido");
                    break;
            }
        }
      
        
        
        System.out.println("Client aplication solutionated");
    }
    
}
