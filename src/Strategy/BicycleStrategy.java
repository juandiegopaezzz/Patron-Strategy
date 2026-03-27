package Strategy;



public class BicycleStrategy implements RouteStrategy {

    private String bikeLanes = "Ciclovias disponibles";

    @Override
    public void buildRoute(String start, String end) {
        System.out.println("Calculando ruta en bicicleta de " + start + " a " + end);
        System.out.println("Usando: " + bikeLanes);
    }
}
