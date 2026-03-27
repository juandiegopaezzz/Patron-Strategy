package Strategy;


public class RoadStrategy implements RouteStrategy {

    private String mapData = "Mapa de carreteras";
    private String trafficInfo = "Trafico moderado";

    @Override
    public void buildRoute(String start, String end) {
        System.out.println("Calculando ruta por carretera de " + start + " a " + end);
        System.out.println("Usando: " + mapData + " y " + trafficInfo);
    }
}