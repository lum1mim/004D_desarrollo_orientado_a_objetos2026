import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<ProductoFisico> coleccion_juegos_fisicos = new ArrayList<>();
    static ArrayList<ProductoDigital> coleccion_juegos_digitales = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        MostrarMenu();
    }

    public static void MostrarMenu() {

        boolean mostrar_menu = true;

        while (mostrar_menu) {
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println("4");
            System.out.println("5");
            System.out.println("6");
            System.out.println("elije una de las opciones");

            String opcion_menu = sc.nextLine();

            switch (opcion_menu) {
                case "1":
                    registrarProductoFisico();
                    break;
                case "2":
                    listarInventario();
                    break;

                case "3":

                    break;

                case "4":

                    break;

                case "5":

                    break;

                case "6":

                    break;

                default:
                    break;
            }
        }

    }

    public void registrarProducto() {
        boolean mostrar_menu = true;

        while (mostrar_menu) {
            System.out.println("fisico");
            System.out.println("digital");
            System.out.println("volver");
            System.out.println("elije uno");

            String opcion_registro = sc.nextLine();

            switch (opcion_registro) {
                case "1":
                    registrarProductoFisico();
                    break;
                case "2":
                    registrarProductoDigital();
                    break;

                case "3":
                mostrar_menu = false;
                    break;

                default:
                    break;
            }
        }
    }

    public static void registrarProductoFisico(){
        String nombre = sc.nextLine();
        int precio_base = Integer.parseInt(sc.nextLine());
        int stock = Integer.parseInt(sc.nextLine());
        int CostoEnvio = Integer.parseInt(sc.nextLine());

        ProductoFisico juego = new ProductoFisico(nombre, precio_base, stock, CostoEnvio);
        coleccion_juegos_fisicos.add(juego);
    }

    static public void listarInventario(){
        for (ProductoFisico productoFisico : coleccion_juegos_fisicos) {
            System.out.println(productoFisico.mostrarInfo());
        }
    }

    public static void registrarProductoDigital(){
        String nombre = sc.nextLine();
        int precio_base = Integer.parseInt(sc.nextLine());
        int stock = Integer.parseInt(sc.nextLine());
        int descuento = Integer.parseInt(sc.nextLine());
        String plataforma = sc.nextLine();

        ProductoDigital juego = new ProductoDigital(nombre, precio_base, stock, descuento, plataforma);
        coleccion_juegos_digitales.add(juego);

    }
}
