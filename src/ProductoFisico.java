public class ProductoFisico extends Producto {
    private int CostoEnvio;  //empezar haciendo las clases padre

    ProductoFisico(String nombre, int precio_base, int stock, int CostoEnvio){
        super(nombre, precio_base, stock); //super hereda el comportamiento del padre y lo inicializa
        this.CostoEnvio = CostoEnvio;
    }

    @Override //sobre escribe el comportamiento del metodo
    public int calcularPrecioinal() {
        return this.getPrecioBase() + this.CostoEnvio;
    }

    public int GetCostoenvio(){
        return this.CostoEnvio;
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + this.CostoEnvio;
    }

}
