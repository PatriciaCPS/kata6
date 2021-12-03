
package kata6;

import java.util.Scanner;
import kata6.toys.Car;
import kata6.toys.Helicopter;
import kata6.toys.SerialNumberGenerator;
import kata6.toys.ToyBusiness;

/**
 *
 * @author Patricia
 */
public class Main {

    public static void main(String[] args) {
        SerialNumberGenerator serialNumberGenerator = new SerialNumberGenerator() ;
        ToyBusiness toyBusiness = new ToyBusiness();
        
        while(true){
        System.out.println("Introduce command ");
        Scanner keyboard = new Scanner(System.in);
        String command = keyboard.nextLine();
        if (command.equals("exit")){ 
            break;
        }else if (command.equals("car")){
            toyBusiness.createCar();
        } else if (command.equals("helicopter")){
            toyBusiness.createHelicopter();
        } else{
            System.out.println("comando inválido introduce command válido");
        
        }
        }
        
        System.out.println("Client aplication solutionated");
    }
    
}
