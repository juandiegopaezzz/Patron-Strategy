
package context;

import Strategy.RouteStrategy;

public class Navigator {

    private RouteStrategy strategy;

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void buildRoute(String start, String end) {
        if (strategy == null) {
            System.out.println("Seleccione una estrategia de ruta primero.");
            return;
        }
        strategy.buildRoute(start, end);
    }
}