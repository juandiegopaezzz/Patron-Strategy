package Strategy;



public class PublicTransportStrategy implements RouteStrategy {

    private String busRoutes = "Rutas de buses";
    private String trainSchedules = "Horarios de tren";

    @Override
    public void buildRoute(String start, String end) {
        System.out.println("Calculando ruta en transporte publico de " + start + " a " + end);
        System.out.println("Consultando: " + busRoutes + " y " + trainSchedules);
    }
}