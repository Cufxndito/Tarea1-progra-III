public class Main {

    public static void main(String[] args) {

        Vehiculo generico = new Vehiculo("Marca generica", "Modelo base", 2000, 800.00);
        System.out.println("=== Vehiculo padre ===");
        generico.mostrarInfo();
        generico.conducir();
        System.out.println();

        Auto auto = new Auto("Toyota", "Corolla", 2022, 25000.00, 4);
        Moto moto = new Moto("Honda", "CBR600", 2021, 9500.00, "Deportiva");
        Camion camion = new Camion("Mercedes-Benz", "Actros", 2019, 120000.00, 25.0);

        System.out.println("=== Auto ===");
        auto.mostrarInfo();
        auto.conducir();
        System.out.println();

        System.out.println("=== Moto ===");
        moto.mostrarInfo();
        moto.conducir();
        System.out.println();

        System.out.println("=== Camion ===");
        camion.mostrarInfo();
        camion.conducir();
        System.out.println();

    }
}
