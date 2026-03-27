package Strategy;


public class WalkingStrategy implements RouteStrategy {

    private String sidewalks = "Zonas peatonales";
    private double walkingSpeed = 5.0;

    @Override
    public void buildRoute(String start, String end) {
        System.out.println("Calculando ruta a pie de " + start + " a " + end);
        System.out.println("Velocidad promedio: " + walkingSpeed + " km/h");
    }
}
