class Shampoo extends Product {
    private final int content;
    public Shampoo(String name, int content, double price) {
        super(name, price);
        this.content = content;
    }
    @Override
    public String toString() {
        return String.format("Nombre: %s /// Contenido: %dml /// Precio: $%d", name, content, (int) price);
    }
}
