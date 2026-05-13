public class Camion extends Vehiculo {

    private double capacidadToneladas;

    public Camion(String marca, String modelo, int anioFabricacion, double precio, double capacidadToneladas) {
        super(marca, modelo, anioFabricacion, precio);
        this.capacidadToneladas = capacidadToneladas;
    }

    @Override
    public void conducir() {
        System.out.println("Transportando carga pesada en el camion.");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Capacidad de carga: " + capacidadToneladas + " toneladas");
    }

    public double getCapacidadToneladas() {
        return capacidadToneladas;
    }

    public void setCapacidadToneladas(double capacidadToneladas) {
        this.capacidadToneladas = capacidadToneladas;
    }
}
