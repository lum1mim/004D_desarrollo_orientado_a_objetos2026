public class ProductoDigital extends Producto{
    private int descuento;
    private String plataforma;

    public ProductoDigital(String nombre, int precio_base, int stock, int descuento, String plataforma) {
        super(nombre, precio_base, stock);
        this.descuento = descuento;
        this.plataforma = plataforma;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public int calcularPrecioinal() {
        return (getPrecioBase() * this.descuento) / 100;
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + "el descuento es: " + this.descuento + "plataforma: " + this.plataforma;
    }
}
