package src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Mostrarmenu();
        }

    static void Mostrarmenu(){

    String opcion_menu;
    boolean mantener_menu = true;
    Personaje personaje_jugador = new Personaje();

    Scanner scanner = new Scanner(System.in);

    while (mantener_menu){
        System.out.println("1. crear personaje");
        System.out.println("2. ver personaje");
        System.out.println("3. cerrar");
        System.out.println("elije una de las opciones del menu!!");
        opcion_menu = scanner.nextLine();

        switch (opcion_menu) {
            case "1":
                System.out.println("creacion del personaje");
                System.out.println("como se llamara tu personaje?");
                personaje_jugador.nombre = scanner.nextLine();
                System.out.println("Como llamaras al apeliido de tu personaje?");
                personaje_jugador.apallido = scanner.nextLine();
                System.out.println("asignale la vida a tu personaje");
                personaje_jugador.setVida(Integer.parseInt(scanner.nextLine()));
                break;
            case "2":
                System.out.println("datos del personaje creado");
                System.out.println("nombre: "+ personaje_jugador.nombre);
                System.out.println("apellido: "+ personaje_jugador.apallido);
                System.out.println("vida personaje: "+ personaje_jugador.getVida());
                System.out.println("esta vivo? "+ personaje_jugador.esta_vivo);
                break;
            case "3":
                System.out.println("bye bye have a nice day");
                mantener_menu = false;
                break;
            default:
                System.out.println("bru, elije una de las opciones validas");
                break;
            }
        }
    }
}