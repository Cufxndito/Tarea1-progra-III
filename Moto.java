public class Moto extends Vehiculo {

    private String tipo; // Ej: "Deportiva", "Cruiser", "Enduro"

    public Moto(String marca, String modelo, int anioFabricacion, double precio, String tipo) {
        super(marca, modelo, anioFabricacion, precio);
        this.tipo = tipo;
    }

    @Override
    public void conducir() {
        System.out.println("Acelerando la moto a fondo.");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: " + tipo);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
