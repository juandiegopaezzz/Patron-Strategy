package Strategy;



public class TouristStrategy implements RouteStrategy {

    private String touristAttractions = "Puntos turisticos";

    @Override
    public void buildRoute(String start, String end) {
        System.out.println("Calculando ruta turistica de " + start + " a " + end);
        System.out.println("Incluyendo: " + touristAttractions);
    }
}