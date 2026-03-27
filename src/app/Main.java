package app;


import Strategy.BicycleStrategy;
import Strategy.PublicTransportStrategy;
import Strategy.RoadStrategy;
import Strategy.TouristStrategy;
import Strategy.WalkingStrategy;
import context.Navigator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Navigator navigator = new Navigator();
        
        System.out.println("Bienvenido(@) al sistema de navegacion! ");

        System.out.print("Ingrese punto de inicio: ");
        String start = sc.nextLine();

        System.out.print("Ingrese destino: ");
        String end = sc.nextLine();

        System.out.println("\nSeleccione tipo de ruta:");
        System.out.println("1. Carretera");
        System.out.println("2. A pie");
        System.out.println("3. Transporte publico");
        System.out.println("4. Bicicleta");
        System.out.println("5. Turistica");

        int option = sc.nextInt();

        switch (option) {
            case 1:
                navigator.setStrategy(new RoadStrategy());
                break;
            case 2:
                navigator.setStrategy(new WalkingStrategy());
                break;
            case 3:
                navigator.setStrategy(new PublicTransportStrategy());
                break;
            case 4:
                navigator.setStrategy(new BicycleStrategy());
                break;
            case 5:
                navigator.setStrategy(new TouristStrategy());
                break;
            default:
                System.out.println("Opcion invalida");
                return;
        }

        navigator.buildRoute(start, end);
    }
}