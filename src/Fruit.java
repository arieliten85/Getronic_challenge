class Fruit extends Product {
    private final String saleUnit;
    public Fruit(String name, double price, String saleUnit) {
        super(name, price);
        this.saleUnit = saleUnit;
    }
    @Override
    public String toString() {
        return String.format("Nombre: %s /// Precio: $%d /// Unidad de venta: %s", name, (int) price, saleUnit);
    }
}
