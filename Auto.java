public class Auto extends Vehiculo {

    private int numeroPuertas;

    public Auto(String marca, String modelo, int anioFabricacion, double precio, int numeroPuertas) {
        super(marca, modelo, anioFabricacion, precio);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void conducir() {
        System.out.println("Manejando el auto por la ciudad.");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Numero de puertas: " + numeroPuertas);
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
}
