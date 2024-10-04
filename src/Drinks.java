class Drinks extends Product {
    protected double liters;
    public Drinks(String name, double liters, double price) {
        super(name, price);
        this.liters = liters;
    }
    @Override
    public String toString() {
        return String.format("Nombre: %s /// Litros: %.1f /// Precio: $%d", name, liters, (int) price);
    }
}
