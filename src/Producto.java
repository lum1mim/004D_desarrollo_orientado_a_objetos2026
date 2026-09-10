public abstract class Producto {  //clase que no se puede instanciar 
    private String nombre;
    private int precio_base;
    private int stock;

    Producto(String nombre, int precio_base, int stock){  // atributos obligatorios van en el constructor
        this.nombre = nombre;
        this.stock = stock;
        this.precio_base = precio_base;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getPrecioBase(){
        return precio_base;
    }

    public int getStock(){
        return this.stock;
    }

    public void SetStock(int stock){

    }

    public abstract int calcularPrecioinal();

    public String mostrarInfo(){
        return "juego " + this.nombre + "tiene precio base de: " + this.precio_base + " stock: " + this.stock;
    }
}

// el programa debe funcionar si o si
// cuando todos los hijos tienen que hacerlo pero distinto lleva abstract para obligarlos a crear el metodo y heredarlo